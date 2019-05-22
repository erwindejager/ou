mtype = {handleRequest,handleComplexRequest,rejectRequest,reinjectRequest,createExceptionTask};
typedef type_HandleRequestRequestMessage{
int parameters;
}
typedef type_HandleRequestResponseMessage{
int parameters;
}
typedef type_handleComplexRequestRequest{
int parameters;
}
typedef type_handleComplexRequestResponse{
int parameters;
}
typedef type_rejectRequestRequest{
int parameters;
}
typedef type_rejectRequestResponse{
int parameters;
}
typedef type_reinjectRequestRequest{
int parameters;
}
typedef type_reinjectRequestResponse{
int parameters;
}
typedef type_rejectRequestWSResponse{
int parameters;
}
typedef type_rejectRequestWSRequest{
int parameters;
}
typedef type_WsException{
int parameters;
}
typedef type_createExceptionTaskResponse{
int parameters;
}
typedef type_createExceptionTaskRequest{
int parameters;
}
typedef type_checkProcessabilityResponse{
int parameters;
}
typedef type_checkProcessabilityRequest{
int parameters;
}
typedef type_processRequestResponse{
int parameters;
}
typedef type_processRequestRequest{
int parameters;
}
typedef type_classifyRequestResponse{
int parameters;
}
typedef type_classifyRequestRequest{
int parameters;
}
typedef type_createManualTaskResponse{
int parameters;
}
typedef type_createManualTaskRequest{
int parameters;
}

chan canal_client_IN = [5] of {mtype, type_HandleRequestRequestMessage};
chan canal_HandleRequestWSPL_IN = [5] of {mtype, type_createExceptionTaskResponse};
chan canal_HandleRequestWSPL_OUT = [5] of {mtype, type_createExceptionTaskRequest};

bool terminate_signal = false ;
type_HandleRequestRequestMessage handleRequestInput;
type_HandleRequestResponseMessage handleRequestOutput;
type_type_chaineCaracteres reinject;
type_type_chaineCaracteres service;
type_type_chaineCaracteres ok;
type_handleComplexRequestRequest handleComplexRequestInput;
type_handleComplexRequestResponse handleComplexRequestOutput;
type_rejectRequestRequest rejectRequestInput;
type_rejectRequestResponse rejectRequestOutput;
type_reinjectRequestRequest reinjectRequestInput;
type_reinjectRequestResponse reinjectRequestOutput;
type_rejectRequestWSResponse rejectRequestWSResp;
type_rejectRequestWSRequest rejectRequestWSReq;
type_WsException exception;
type_createExceptionTaskResponse createExceptionTaskWSResponse;
type_createExceptionTaskRequest createExceptionTaskWSRequest;
type_type_chaineCaracteres payload;
type_checkProcessabilityResponse checkProcessabilityWSResponse;
type_checkProcessabilityRequest checkProcessabilityWSRequest;
type_processRequestResponse handleRequestWSResponse;
type_processRequestRequest handleRequestWSRequest;
type_type_chaineCaracteres valid;
type_classifyRequestResponse classifyRequestWSResponse;
type_classifyRequestRequest classifyRequestWSRequest;
type_type_chaineCaracteres requestType;
type_createManualTaskResponse createManualTaskWSResponse;
type_createManualTaskRequest createManualTaskWSRequest;


proctype client() provided (!terminate_signal){
type_HandleRequestRequestMessage output_Send;
/*randomize the input value*/
byte valclient;
if
::  skip -> valclient=100;
::  skip -> valclient=10;
fi;
output_Send.parameters=valclient;
canal_client_IN ! handleRequest, output_Send;
}



proctype HandleRequestWSPL() provided (!terminate_signal){
type_createExceptionTaskRequest input_Receive;
type_createExceptionTaskResponse output_Send;
canal_HandleRequestWSPL_OUT ? createExceptionTask, input_Receive;
/*randomize the input value*/
byte valHandleRequestWSPL;
if
::  skip -> valHandleRequestWSPL=100;
::  skip -> valHandleRequestWSPL=10;
fi;
output_Send.parameters=valHandleRequestWSPL;
canal_HandleRequestWSPL_IN ! createExceptionTask, output_Send;
}


proctype HandleRequest() provided (!terminate_signal){
/* Begin_Sequence */
/* Begin_Pick_HandleService */
if

/* Begin_onMsg */
:: canal_client_IN ? handleRequest, handleRequestInput -> 

/* End_onMsg */

/* Begin_Assign_PrepareHandleRequest */
/* End_Assign_PrepareHandleRequest */

/* Begin_onMsg */
:: canal_client_IN ? handleComplexRequest, handleComplexRequestInput -> 

/* End_onMsg */

/* Begin_Assign_PrepareHandleComplexRequest */
payload=handleComplexRequestInput.parameters;
/* End_Assign_PrepareHandleComplexRequest */

/* Begin_onMsg */
:: canal_client_IN ? rejectRequest, rejectRequestInput -> 

/* End_onMsg */

/* Begin_Assign_PrepareRejectRequest */
payload=rejectRequestInput.parameters;
/* End_Assign_PrepareRejectRequest */

/* Begin_onMsg */
:: canal_client_IN ? reinjectRequest, reinjectRequestInput -> 

/* End_onMsg */

/* Begin_Assign_PrepareReinjectRequest */
service=reinjectRequestInput.parameters;
payload=reinjectRequestInput.parameters;
/* End_Assign_PrepareReinjectRequest */
fi;
/* End_Pick_HandleService */
/* Begin_if_HandleService */
if
::(service='handleRequest') -> /* Begin_Sequence */
/* Begin_Sequence */

/* Begin_Assign_PrepareClassifyRequest */
classifyRequestWSRequest.parameters=payload;
/* End_Assign_PrepareClassifyRequest */
/* End_Sequence */
/* End_Sequence */
/* Begin_Sequence */

/* Begin_Assign_PrepareExceptionTask */
/* End_Assign_PrepareExceptionTask */

/* Begin_Invoke_InvokeCreateExceptionTask */
canal_HandleRequestWSPL_OUT ! createExceptionTask, createExceptionTaskWSRequest;
canal_HandleRequestWSPL_IN ? createExceptionTask, createExceptionTaskWSResponse;
/* End_Invoke_InvokeCreateExceptionTask */
/* End_Sequence */
fi;

/* End_if_HandleService */
/* End_Sequence */
}

init{
atomic{

/* Begin_process_HandleRequest */
run client();
run HandleRequestWSPL();
run HandleRequest();

/* End_process_HandleRequest */
}
}
