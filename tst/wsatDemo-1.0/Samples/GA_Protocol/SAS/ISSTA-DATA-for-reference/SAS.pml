/** Type Declarations **/
typedef  t2_requestlist{
  int  stockID[3];
  int  stockID_occ;
}
typedef  t3_payment{
  int  accountNum;
  int  creditCard;
  mtype choice;
}
typedef  Register{
  bool  orderID;
  t2_requestlist  requestlist;
  t3_payment  payment;
}
typedef  Reject{
  bool  orderID;
}
typedef  Accept{
  bool  orderID;
}
typedef  Cancel{
  bool  orderID;
}
typedef  Bill{
  bool  orderID;
}
typedef  Ack{
  bool  orderID;
}
typedef  Request{
  bool  orderID;
  int  stockID;
}
typedef  Report{
  bool  orderID;
  int  stockID;
}
typedef  Terminate{
  bool  orderID;
}
mtype = { m_accountNum, m_creditCard};

/** Variables definitions **/
Register    reginfo;
Cancel    cancel;
Ack    ack;
Reject    reject;
Accept    accept;
Bill    bill;
Request    request;
Report    report;
Terminate    terminate;
mtype = {m_reginfo, m_cancel, m_ack, m_reject, m_accept, m_bill, m_request, 
  m_report, m_terminate, m_undefined};
mtype msg;
mtype = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};
mtype state;

/* variables used in evaluating XPATH quries */
bool boolVar_0, boolVar_1, boolVar_2, boolVar_3, boolVar_4, boolVar_5, 
boolVar_6, boolVar_7, boolVar_8, boolVar_9, boolVar_10, boolVar_11, boolVar_12, 
boolVar_13, boolVar_14;
int intVar_0, intVar_1, intVar_2, intVar_3, intVar_4, intVar_5;

active proctype GuardedProtocol(){
  state = s1;
  msg= m_undefined;
  atomic{
  /* initialization of message variables */
  //initialize message reginfo
  if 
    :: reginfo.orderID=true
    :: reginfo.orderID=false
  fi; 
  if 
    ::boolVar_0=0;
    ::boolVar_0=1;
  fi; 
  if 
    ::boolVar_1=0;
    ::boolVar_1=1;
  fi; 
  reginfo.requestlist.stockID_occ=(1*boolVar_0+2*boolVar_1)%3;
  reginfo.requestlist.stockID_occ=reginfo.requestlist.stockID_occ+1;
  intVar_0=0;
  do :: intVar_0<reginfo.requestlist.stockID_occ-> 
    if 
      ::boolVar_0=0;
      ::boolVar_0=1;
    fi; 
    reginfo.requestlist.stockID[intVar_0]=(1*boolVar_0)%2;
    intVar_0++;
  :: else -> break 
od;
  if 
    ::reginfo.payment.choice=m_accountNum;
    ::reginfo.payment.choice=m_creditCard;
  fi; 
  if 
    ::boolVar_0=0;
    ::boolVar_0=1;
  fi; 
  reginfo.payment.accountNum=(1*boolVar_0)%2;
  if 
    ::boolVar_0=0;
    ::boolVar_0=1;
  fi; 
  reginfo.payment.creditCard=(1*boolVar_0)%2;
  //initialize message cancel
  if 
    :: cancel.orderID=true
    :: cancel.orderID=false
  fi; 
  //initialize message ack
  if 
    :: ack.orderID=true
    :: ack.orderID=false
  fi; 
  //initialize message reject
  if 
    :: reject.orderID=true
    :: reject.orderID=false
  fi; 
  //initialize message accept
  if 
    :: accept.orderID=true
    :: accept.orderID=false
  fi; 
  //initialize message bill
  if 
    :: bill.orderID=true
    :: bill.orderID=false
  fi; 
  //initialize message request
  if 
    :: request.orderID=true
    :: request.orderID=false
  fi; 
  if 
    ::boolVar_0=0;
    ::boolVar_0=1;
  fi; 
  request.stockID=(1*boolVar_0)%2;
  //initialize message report
  if 
    :: report.orderID=true
    :: report.orderID=false
  fi; 
  if 
    ::boolVar_0=0;
    ::boolVar_0=1;
  fi; 
  report.stockID=(1*boolVar_0)%2;
  //initialize message terminate
  if 
    :: terminate.orderID=true
    :: terminate.orderID=false
  fi; 
  };
//end of init.
  do
   ::
    atomic{
    
    /* compute last() function calls */
    // compute last(), corresponding variable is intVar_0
    intVar_0 = 0;
    intVar_1 = 0;
    intVar_2= 0;
    do
     :: intVar_2 < reginfo.requestlist.stockID_occ -> 
        boolVar_0=false;
        /* calculate position()*/
        intVar_1++;
          /* calculate last()*/
          intVar_0++;
        if 

          ::
            boolVar_0
            ->
          :: else -> skip;
        fi; 

        intVar_2++;
     :: else -> break;
    od;
    // compute last(), corresponding variable is intVar_3
    intVar_3 = 0;
    intVar_4 = 0;
    intVar_5= 0;
    do
     :: intVar_5 < reginfo.requestlist.stockID_occ -> 
        boolVar_1=false;
        /* calculate position()*/
        intVar_4++;
          /* calculate last()*/
          intVar_3++;
        if 

          ::
            boolVar_1
            ->
          :: else -> skip;
        fi; 

        intVar_5++;
     :: else -> break;
    od;
    /* evaluation of guard for transition t1 */
    if 

      ::
        state==s1
        ->
        boolVar_2=false;

        if 

          ::
            true
            ->
            boolVar_2=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t2 */
    if 

      ::
        state==s2
        ->
        boolVar_3=false;

        if 

          ::
            true
            ->
            boolVar_3=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t3 */
    if 

      ::
        state==s3
        ->
        boolVar_4=false;

        if 

          ::
            true
            ->
            boolVar_4=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t4 */
    if 

      ::
        state==s2
        ->
        boolVar_5=false;

        if 

          ::
            true
            ->
            boolVar_5=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t5 */
    if 

      ::
        state==s5
        ->
        boolVar_6=false;

        if 

          ::
            true
            ->
            boolVar_6=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t6 */
    if 

      ::
        state==s6
        ->
        boolVar_7=false;

        if 

          ::
            true
            ->
            boolVar_7=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t7 */
    if 

      ::
        state==s7
        ->
        boolVar_8=false;

        if 

          ::
            true
            ->
            boolVar_8=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t8 */
    if 

      ::
        state==s8
        ->
        boolVar_9=false;
        intVar_1 = 0;
        intVar_2= 0;
        do
         :: intVar_2 < reginfo.requestlist.stockID_occ -> 
            boolVar_0=false;
            /* calculate position()*/
            intVar_1++;

              if 

                ::
                  intVar_1==intVar_0
                  ->
                  boolVar_0=true
                :: else -> skip;
              fi; 
            if 

              ::
                boolVar_0
                ->

                if 

                  ::
                    request.stockID!=reginfo.requestlist.stockID[intVar_2]
                    ->
                    boolVar_9=true
                  :: else -> skip;
                fi; 
              :: else -> skip;
            fi; 

            intVar_2++;
         :: else -> break;
        od;
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t9 */
    if 

      ::
        state==s9
        ->
        boolVar_0=false;

        if 

          ::
            true
            ->
            boolVar_0=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t10 */
    if 

      ::
        state==s10
        ->
        boolVar_10=false;

        if 

          ::
            true
            ->
            boolVar_10=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t11 */
    if 

      ::
        state==s7
        ->
        boolVar_11=false;

        if 

          ::
            true
            ->
            boolVar_11=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t12 */
    if 

      ::
        state==s10
        ->
        boolVar_12=false;

        if 

          ::
            true
            ->
            boolVar_12=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t13 */
    if 

      ::
        state==s11
        ->
        boolVar_13=false;

        if 

          ::
            true
            ->
            boolVar_13=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t14 */
    if 

      ::
        state==s8
        ->
        boolVar_14=false;
        intVar_4 = 0;
        intVar_5= 0;
        do
         :: intVar_5 < reginfo.requestlist.stockID_occ -> 
            boolVar_1=false;
            /* calculate position()*/
            intVar_4++;

              if 

                ::
                  intVar_4==intVar_3
                  ->
                  boolVar_1=true
                :: else -> skip;
              fi; 
            if 

              ::
                boolVar_1
                ->

                if 

                  ::
                    request.stockID==reginfo.requestlist.stockID[intVar_5]
                    ->
                    boolVar_14=true
                  :: else -> skip;
                fi; 
              :: else -> skip;
            fi; 

            intVar_5++;
         :: else -> break;
        od;
      :: else -> skip;
    fi; 
    /* evaluation of guard for transition t15 */
    if 

      ::
        state==s12
        ->
        boolVar_1=false;

        if 

          ::
            true
            ->
            boolVar_1=true
          :: else -> skip;
        fi; 
      :: else -> skip;
    fi; 
    }; 
//end of evaluation of trans. conditions. 
    
    
    /* Transitions */
    if
      /* transition t1 */
      :: state==s1 && boolVar_2 ->  
        atomic{
        state=s2;
        msg=m_reginfo;
        skip; };
      /* transition t2 */
      :: state==s2 && boolVar_3 ->  
        atomic{
        state=s3;
        msg=m_reject;
        reject.orderID=reginfo.orderID;
        skip; };
      /* transition t3 */
      :: state==s3 && boolVar_4 ->  
        atomic{
        state=s4;
        msg=m_terminate;
        terminate.orderID=reginfo.orderID;
        skip; };
      /* transition t4 */
      :: state==s2 && boolVar_5 ->  
        atomic{
        state=s5;
        msg=m_accept;
        accept.orderID=reginfo.orderID;
        skip; };
      /* transition t5 */
      :: state==s5 && boolVar_6 ->  
        atomic{
        state=s6;
        msg=m_request;
        request.orderID=reginfo.orderID;
        intVar_0 = 0;
        intVar_1= 0;
        do
         :: intVar_1 < reginfo.requestlist.stockID_occ -> 
            boolVar_2=false;
            /* calculate position()*/
            intVar_0++;

              if 

                ::
                  intVar_0==1
                  ->
                  boolVar_2=true
                :: else -> skip;
              fi; 
            if 

              ::
                boolVar_2
                ->
                request.stockID=reginfo.requestlist.stockID[intVar_1];
              :: else -> skip;
            fi; 

            intVar_1++;
         :: else -> break;
        od;
        skip; };
      /* transition t6 */
      :: state==s6 && boolVar_7 ->  
        atomic{
        state=s7;
        msg=m_report;
        report.orderID=request.orderID;
        skip; };
      /* transition t7 */
      :: state==s7 && boolVar_8 ->  
        atomic{
        state=s8;
        msg=m_ack;
        ack.orderID=report.orderID;
        skip; };
      /* transition t8 */
      :: state==s8 && boolVar_9 ->  
        atomic{
        state=s9;
        msg=m_request;
        request.orderID=reginfo.orderID;
        intVar_0 = 0;
        intVar_1 = 0;
        intVar_2= 0;
        do
         :: intVar_2 < reginfo.requestlist.stockID_occ -> 
            boolVar_2=false;
            /* calculate position()*/
            intVar_1++;
              intVar_3= 0;
              do
               :: intVar_3 < reginfo.requestlist.stockID_occ -> 
                  boolVar_3=false;

                  if 

                    ::
                      reginfo.requestlist.stockID[intVar_3]==request.stockID
                      ->
                      boolVar_3=true
                    :: else -> skip;
                  fi; 
                  if 

                    ::
                      boolVar_3
                      ->
                      /* calculate position()*/
                      intVar_0++;

                        if 

                          ::
                            intVar_1==intVar_0+1
                            ->
                            boolVar_2=true
                          :: else -> skip;
                        fi; 
                    :: else -> skip;
                  fi; 

                  intVar_3++;
               :: else -> break;
              od;
            if 

              ::
                boolVar_2
                ->
                request.stockID=reginfo.requestlist.stockID[intVar_2];
              :: else -> skip;
            fi; 

            intVar_2++;
         :: else -> break;
        od;
        skip; };
      /* transition t9 */
      :: state==s9 && boolVar_0 ->  
        atomic{
        state=s10;
        msg=m_report;
        report.orderID=request.orderID;
        skip; };
      /* transition t10 */
      :: state==s10 && boolVar_10 ->  
        atomic{
        state=s8;
        msg=m_ack;
        ack.orderID=report.orderID;
        skip; };
      /* transition t11 */
      :: state==s7 && boolVar_11 ->  
        atomic{
        state=s11;
        msg=m_cancel;
        cancel.orderID=reginfo.orderID;
        skip; };
      /* transition t12 */
      :: state==s10 && boolVar_12 ->  
        atomic{
        state=s11;
        msg=m_cancel;
        cancel.orderID=reginfo.orderID;
        skip; };
      /* transition t13 */
      :: state==s11 && boolVar_13 ->  
        atomic{
        state=s12;
        msg=m_bill;
        bill.orderID=reginfo.orderID;
        skip; };
      /* transition t14 */
      :: state==s8 && boolVar_14 ->  
        atomic{
        state=s12;
        msg=m_bill;
        bill.orderID=reginfo.orderID;
        skip; };
      /* transition t15 */
      :: state==s12 && boolVar_1 ->  
        atomic{
        state=s4;
        msg=m_terminate;
        terminate.orderID=reginfo.orderID;
        skip; };
      
      /* rules for final states */
      :: state==s4->break;
    fi;
  od;
  printf("End of execution of protocol.\n");
}

#define constIdx 1
#define constValue 1
#define p (constIdx <reginfo.requestlist.stockID_occ && reginfo.requestlist.stockID[constIdx] == constValue && msg==m_reginfo)
#define q1 (request.stockID == constValue)
#define q2 (msg==m_cancel)
#define q3 (msg==m_reject)

never {    /* ! [](p -> (<>q1 || <>q2 || <>q3)) */
T0_init:
        if
        :: (! ((q1)) && ! ((q2)) && ! ((q3)) && (p)) -> goto accept_S4
        :: (1) -> goto T0_init
        fi;
accept_S4:
        if
        :: (! ((q1)) && ! ((q2)) && ! ((q3))) -> goto accept_S4
        fi;
}

