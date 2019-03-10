%% Automatically generated by EDJ BPEL2DCG Transformer : Tue Mar 05 22:44:46 CET 2019


grammar_HandleCaseProcess --> ["v0"], c_main, ["v"].


c_onm_handleCase --> ["InitHandleCase"].

c_onm_handleParkedCase --> ["InitHandleParkedCase"].

c_onm_stopCase --> ["InitStopCase"].

c_onm_handleObjection --> ["InitHandleObjection"].

c_onm_reinjectCase --> ["InitReinjectCase"].

c_pick_HandleRequest --> ["HandleRequest"], c_onm_handleCase.

c_pick_HandleRequest --> ["HandleRequest"], c_onm_handleParkedCase.

c_pick_HandleRequest --> ["HandleRequest"], c_onm_stopCase.

c_pick_HandleRequest --> ["HandleRequest"], c_onm_handleObjection.

c_pick_HandleRequest --> ["HandleRequest"], c_onm_reinjectCase.

c_catch_InvokeRegisterCase --> [].

c_catch_InvokeRegisterCase --> ["PrepareRollback"], ["StopProcess"], ["@END@"].

c_catch_InvokeCreateCase --> [].

c_catch_InvokeCreateCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].

c_catch_InvokeValidateCase --> [].

c_catch_InvokeValidateCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].

c_catch_InvokeParkCase --> [].

c_catch_InvokeParkCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].


c_if_IfNotReinjectedCase --> ["IfNotReinjectedCase"].

c_if_IfNotReinjectedCase --> ["IfNotReinjectedCase"], ["PrepareReplyHandleCase"], ["ReplyHandleCase"].

c_catch_InvokeGetCalculation --> [].

c_catch_InvokeGetCalculation --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].

c_catch_InvokeCheckProcessability --> [].

c_catch_InvokeCheckProcessability --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].


c_if_IfDegree --> ["IfDegree"].

c_catch_InvokeCreatePayment --> [].

c_catch_InvokeCreatePayment --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].

c_if_IfDegree --> ["IfDegree"], ["PrepareInvokeCreatePayment"], ["InvokeCreatePayment"], c_catch_InvokeCreatePayment.

c_catch_InvokeSendLetter --> [].

c_catch_InvokeSendLetter --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].

c_catch_InvokeEndCase --> [].

c_catch_InvokeEndCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].


c_if_IfNotReinjectedParkedCase --> ["IfNotReinjectedParkedCase"].

c_if_IfNotReinjectedParkedCase --> ["IfNotReinjectedParkedCase"], ["PrepareReplyHandleParkedCase"], ["ReplyHandleParkedCase"].

c_if_HandleReceivedCaseRequest --> ["HandleReceivedCaseRequest"], ["PrepareInvokeGetCalculation"], ["InvokeGetCalculation"], c_catch_InvokeGetCalculation, ["PrepareInvokeCheckProcessability"], ["InvokeCheckProcessability"], c_catch_InvokeCheckProcessability, c_if_IfDegree, ["PrepareInvokeSendLetter"], ["InvokeSendLetter"], c_catch_InvokeSendLetter, ["PrepareInvokeEndCase"], ["InvokeEndCase"], c_catch_InvokeEndCase, c_if_IfNotReinjectedParkedCase.

c_catch_InvokeStopCase --> [].

c_catch_InvokeStopCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].


c_if_IfNotReinjectedStopCase --> ["IfNotReinjectedStopCase"].

c_if_IfNotReinjectedStopCase --> ["IfNotReinjectedStopCase"], ["PrepareReplyStopCase"], ["ReplyStopCase"].

c_if_HandleReceivedCaseRequest --> ["HandleReceivedCaseRequest"], ["PrepareInvokeStopCase"], ["InvokeStopCase"], c_catch_InvokeStopCase, c_if_IfNotReinjectedStopCase.

c_catch_InvokeRegisterObjectionCase --> [].

c_catch_InvokeRegisterObjectionCase --> ["PrepareRollback"], ["StopProcess"], ["@END@"].

c_catch_InvokeCreateObjectionCase --> [].

c_catch_InvokeCreateObjectionCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].

c_catch_InvokeValidateObjectionCase --> [].

c_catch_InvokeValidateObjectionCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].

c_catch_InvokeCreateObjectionTask --> [].

c_catch_InvokeCreateObjectionTask --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].

c_catch_InvokeStopObjectionCase --> [].

c_catch_InvokeStopObjectionCase --> ["PrepareExceptionTask"], ["InvokeCreateExceptionTask"], ["StopProcess"], ["@END@"].

c_if_IfNewObjection --> ["IfNewObjection"], ["PrepareInvokeStopObjectionCase"], ["InvokeStopObjectionCase"], c_catch_InvokeStopObjectionCase.

c_if_IfNewObjection --> ["IfNewObjection"], ["PrepareCreateObjectionTask"], ["InvokeCreateObjectionTask"], c_catch_InvokeCreateObjectionTask.


c_if_IfNotReinjectedObjectionCase --> ["IfNotReinjectedObjectionCase"].

c_if_IfNotReinjectedObjectionCase --> ["IfNotReinjectedObjectionCase"], ["PrepareReplyHandleObjection"], ["ReplyHandleObjection"].

c_if_HandleReceivedCaseRequest --> ["HandleReceivedCaseRequest"], ["PrepareRegisterObjectionCase"], ["InvokeRegisterObjectionCase"], c_catch_InvokeRegisterObjectionCase, ["SaveObjectionTicket"], ["PrepareCreateObjectionCase"], ["InvokeCreateObjectionCase"], c_catch_InvokeCreateObjectionCase, ["PrepareInvokeValidateObjectionCase"], ["InvokeValidateObjectionCase"], c_catch_InvokeValidateObjectionCase, c_if_IfNewObjection, c_if_IfNotReinjectedObjectionCase.

c_if_HandleReceivedCaseRequest --> ["HandleReceivedCaseRequest"], ["PrepareInvokeRegisterCase"], ["InvokeRegisterCase"], c_catch_InvokeRegisterCase, ["SaveTicket"], ["PrepareInvokeCreateCase"], ["InvokeCreateCase"], c_catch_InvokeCreateCase, ["PrepareInvokeValidateCase"], ["InvokeValidateCase"], c_catch_InvokeValidateCase, ["PrepareInvokeParkCase"], ["InvokeParkCase"], c_catch_InvokeParkCase, c_if_IfNotReinjectedCase.


c_if_Reinjected --> ["Reinjected"].

c_if_Reinjected --> ["Reinjected"], ["PrepareReplyReinjectCase"], ["ReplyReinjectCase"].

c_main --> c_pick_HandleRequest, c_if_HandleReceivedCaseRequest, c_if_Reinjected.


stripRule(_, [], []). 
stripRule(T, [T|_], ["v"]). 
stripRule(T, [X|L], [X|NL]) :- stripRule(T, L, NL). 

stripRules([],[]).
stripRules([X|L],[X1|L1]) :- stripRule("@END@", X, X1), stripRules(L, L1).

start:-
    open('HandleCaseProcess.txt',write,OS),
	findall(X, phrase(grammar_HandleCaseProcess,X,[]),AS),
	stripRules(AS,AS1),
	list_to_set(AS1, AsSet),
    forall((member(N,AsSet)), writeln(OS,N)),
    close(OS).

 