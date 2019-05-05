
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
