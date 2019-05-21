%findall(X,
% phrase(grammar_HandleCaseProcess,X,[]),AS),forall((member(N,AS)),
% writeln(N)). sstop(V0) --> ['(<',V0, '@123@', '>)'], ['HandleRequest',
% 'stopCase', 'InitStopCase', 'elseif', 'PrepareInvokeStopCase',
% 'InvokeStopCase', 'PrepareReplyStopCase', 'ReplyStopCase'], [V0].

% ==============================================================
grammar_HandleCaseProcess --> [v0], ['HandleRequest'], c_HandleRequest, [v].

% ===============================================================
c_HandleRequest --> ['handleCase', 'InitHandleCase'], c_reply_HandleReceivedCaseRequest.
c_HandleRequest --> ['handleCase', 'InitHandleCase'], c_exit_HandleReceivedCaseRequest.
c_HandleRequest --> ['handleCase', 'InitHandleCase'], c_HandleReceivedCaseRequest.

% c_HandleRequest --> ['handleParkedCase', 'InitHandleParkedCase'],
% c_reply_HandleParkedCase.
% c_HandleRequest --> ['handleParkedCase', 'InitHandleParkedCase'],
% c_exit_HandleParkedCase.
% c_HandleRequest --> ['handleParkedCase', 'InitHandleParkedCase'],
% c_HandleParkedCase.

c_HandleRequest --> ['stopCase', 'InitStopCase'].




c_HandleRequest --> ['handleObjection', 'InitHandleObjection'].
c_HandleRequest --> ['reinjectCase', 'InitReinjectCase'].

% ===============================================================
c_exit_HandleReceivedCaseRequest --> ['HandleReceivedCaseRequest', 'PrepareInvokeRegisterCase', 'InvokeRegisterCase',
                                 'PrepareRollback', 'StopProcess',  'exit' ].

c_exit_HandleReceivedCaseRequest --> ['HandleReceivedCaseRequest', 'PrepareInvokeRegisterCase', 'InvokeRegisterCase',
                                 'SaveTicket', 'PrepareInvokeCreateCase', 'InvokeCreateCase',
                                 'PrepareExceptionTask', 'InvokeCreateExceptionTask', 'StopProcess', 'exit' ].

c_exit_HandleReceivedCaseRequest --> ['HandleReceivedCaseRequest', 'PrepareInvokeRegisterCase', 'InvokeRegisterCase',
                                 'SaveTicket', 'PrepareInvokeCreateCase', 'InvokeCreateCase',
                                 'PrepareInvokeValidateCase', 'InvokeValidateCase', 'PrepareExceptionTask',
                                 'InvokeCreateExceptionTask', 'StopProcess', 'exit'].

c_exit_HandleReceivedCaseRequest --> ['HandleReceivedCaseRequest', 'PrepareInvokeRegisterCase', 'InvokeRegisterCase',
                                 'SaveTicket', 'PrepareInvokeCreateCase', 'InvokeCreateCase',
                                 'PrepareInvokeValidateCase', 'InvokeValidateCase', 'PrepareInvokeParkCase',
                                 'InvokeParkCase', 'PrepareExceptionTask', 'InvokeCreateExceptionTask',
                                 'StopProcess', 'exit'].

c_reply_HandleReceivedCaseRequest --> ['HandleReceivedCaseRequest', 'PrepareInvokeRegisterCase', 'InvokeRegisterCase',
                                 'SaveTicket', 'PrepareInvokeCreateCase', 'InvokeCreateCase',
                                 'PrepareInvokeValidateCase', 'InvokeValidateCase', 'PrepareInvokeParkCase',
                                 'InvokeParkCase', 'IfNotReinjectedCase', 'PrepareReplyHandleCase', 'ReplyHandleCase'].

c_HandleReceivedCaseRequest --> ['HandleReceivedCaseRequest', 'PrepareInvokeRegisterCase', 'InvokeRegisterCase',
                                 'SaveTicket', 'PrepareInvokeCreateCase', 'InvokeCreateCase',
                                 'PrepareInvokeValidateCase', 'InvokeValidateCase', 'PrepareInvokeParkCase',
                                 'InvokeParkCase'].

% ===============================================================
c_exit_HandleParkedCase    --> ['elseif'], c_exit_InvokeGetCalculation.

c_exit_HandleParkedCase    --> ['elseif'], c_InvokeGetCalculation, c_exit_InvokeCheckProcessability.

c_exit_HandleParkedCase    --> ['elseif'], c_InvokeGetCalculation, c_InvokeCheckProcessability, c_exit_IfDegree.

c_exit_HandleParkedCase    --> ['elseif'], c_InvokeGetCalculation, c_InvokeCheckProcessability, c_exit_InvokeSendLetter.

c_exit_HandleParkedCase    --> ['elseif'], c_InvokeGetCalculation, c_InvokeCheckProcessability, c_InvokeSendLetter, c_exit_InvokeEndcase.

c_exit_HandleParkedCase    --> ['elseif'], c_InvokeGetCalculation, c_InvokeCheckProcessability, c_IfDegree, c_exit_InvokeSendLetter.

c_exit_HandleParkedCase    --> ['elseif'], c_InvokeGetCalculation, c_InvokeCheckProcessability, c_IfDegree, c_InvokeSendLetter, c_exit_InvokeEndcase.

c_reply_HandleParkedCase   --> ['elseif'], c_InvokeGetCalculation, c_InvokeCheckProcessability, c_InvokeSendLetter, c_InvokeEndcase,
                               ['IfNotReinjectedParkedCase', 'PrepareReplyHandleParkedCase', 'ReplyHandleParkedCase'].

c_HandleParkedCase         --> ['elseif'], c_InvokeGetCalculation, c_InvokeCheckProcessability, c_InvokeSendLetter, c_InvokeEndcase.

c_HandleParkedCase         --> ['elseif'], c_InvokeGetCalculation, c_InvokeCheckProcessability, c_IfDegree, c_InvokeSendLetter, c_InvokeEndcase.

c_InvokeGetCalculation           --> ['PrepareInvokeGetCalculation', 'InvokeGetCalculation'].

c_exit_InvokeGetCalculation      --> ['PrepareInvokeGetCalculation', 'InvokeGetCalculation', 'PrepareExceptionTask',
                                      'InvokeCreateExceptionTask', 'StopProcess', 'exit'].

c_InvokeCheckProcessability      --> ['PrepareInvokeCheckProcessability', 'InvokeCheckProcessability'].

c_exit_InvokeCheckProcessability --> ['PrepareInvokeCheckProcessability', 'InvokeCheckProcessability', 'PrepareExceptionTask',
                                      'InvokeCreateExceptionTask', 'StopProcess', 'exit'].

c_IfDegree			 --> ['IfDegree', 'PrepareInvokeCreatePayment', 'InvokeCreatePayment'].

c_exit_IfDegree			 --> ['IfDegree', 'PrepareInvokeCreatePayment', 'InvokeCreatePayment', 'PrepareExceptionTask',
                                      'InvokeCreateExceptionTask', 'StopProcess', 'exit'].

c_InvokeSendLetter               --> ['PrepareInvokeSendLetter', 'InvokeSendLetter'].

c_exit_InvokeSendLetter          --> ['PrepareInvokeSendLetter', 'InvokeSendLetter', 'PrepareExceptionTask', 'InvokeCreateExceptionTask',
                                      'StopProcess', 'exit'].

c_InvokeEndcase                  --> ['PrepareInvokeEndCase', 'InvokeEndCase'].

c_exit_InvokeEndcase             --> ['PrepareInvokeEndCase', 'InvokeEndCase', 'PrepareExceptionTask', 'InvokeCreateExceptionTask',
                                      'StopProcess', 'exit'].













