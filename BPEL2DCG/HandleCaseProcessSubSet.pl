grammar_HandleCaseProcess --> ["v0"], c_main, ["v"].
c_onm_handleCase --> ["InitHandleCase"].
c_pick_HandleRequest --> ["HandleRequest"], c_onm_handleCase.
c_catch_InvokeRegisterCase --> [].
c_catch_InvokeRegisterCase --> ["PrepareRollback"], ["StopProcess"], ["@END@"].
c_catch_InvokeCreateCase --> [].
c_catch_InvokeCreateCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"],
["@END@"].
c_catch_InvokeValidateCase --> [].
c_catch_InvokeValidateCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"],
["@END@"].
c_catch_InvokeParkCase --> [].
c_catch_InvokeParkCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"],
["@END@"].
c_if_IfNotReinjectedCase --> ["IfNotReinjectedCase"].
c_if_IfNotReinjectedCase --> ["IfNotReinjectedCase"], ["PrepareReplyHandleCase"], ["ReplyHandleCase"].
c_if_HandleReceivedCaseRequest --> ["HandleReceivedCaseRequest"], ["PrepareInvokeRegisterCase"],
["InvokeRegisterCase"], c_catch_InvokeRegisterCase, ["SaveTicket"], ["PrepareInvokeCreateCase"],
["InvokeCreateCase"], c_catch_InvokeCreateCase, ["PrepareInvokeValidateCase"], ["InvokeValidateCase"],
c_catch_InvokeValidateCase, ["PrepareInvokeParkCase"], ["InvokeParkCase"], c_catch_InvokeParkCase,
c_if_IfNotReinjectedCase.
c_if_Reinjected --> ["Reinjected"].
c_if_Reinjected --> ["Reinjected"], ["PrepareReplyReinjectCase"], ["ReplyReinjectCase"].
c_main --> c_pick_HandleRequest, c_if_HandleReceivedCaseRequest, c_if_Reinjected.

stripRule(_, [], []). 
stripRule(T, [T|_], ["v"]). 
stripRule(T, [X|L], [X|NL]) :- stripRule(T, L, NL). 

stripRules([],[]).
stripRules([X|L],[X1|L1]) :- stripRule("@END@", X, X1), stripRules(L, L1).

start:-
    open('HandleCaseProcessSub.txt',write,OS),
	findall(X, phrase(grammar_HandleCaseProcess,X,[]),AS),
	stripRules(AS,AS1),
	list_to_set(AS1, AsSet),
    forall((member(N,AsSet)), writeln(OS,N)),
    close(OS).

 