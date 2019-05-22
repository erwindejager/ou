mtype = {process};
typedef type_GitTestRequestMessage{
int payload;
}
typedef type_GitTestResponseMessage{
int payload;
}

chan canal_client_IN = [5] of {mtype, type_GitTestRequestMessage};
chan canal_client_OUT = [5] of {mtype, type_GitTestResponseMessage};

bool terminate_signal = false ;
type_GitTestRequestMessage input;
type_GitTestResponseMessage output;


proctype client() provided (!terminate_signal){
type_GitTestRequestMessage input_Receive;
type_GitTestResponseMessage output_Send;
/*randomize the input value*/
byte valclient;
if
::  skip -> valclient=100;
::  skip -> valclient=10;
fi;
output_Send.payload=valclient;
canal_client_IN ! process, input_Receive;
canal_client_OUT ? process, output_Send;
}


proctype GitTest() provided (!terminate_signal){
/* Begin_Sequence */
/* Begin_Receive_receiveInput */
canal_client_IN ? process, input;
/* End_Receive_receiveInput */


/* Begin_Assign_Assign */
output.payload=input.payload;
/* End_Assign_Assign */
/* Begin_Reply_replyOutput */
canal_client_OUT ! process, output;
/* End_Reply_replyOutput */
/* End_Sequence */
}

init{
atomic{

/* Begin_process_GitTest */
run client();
run GitTest();

/* End_process_GitTest */
}
}
