% findall(X, phrase(grammar_PickSample,X,[]),AS),forall((member(N,AS)), writeln(N)).

%% Automatically generated by EDJ BPEL2DCG Transformer : Fri Nov 30 15:09:32 CET 2018

grammar_PickSample --> ["v0"], c_main, ["v"].

c_onm_sayHello --> ["sayHello"], ["AssignHello"], ["replyHello"].
c_onm_sayGoodbye --> ["sayGoodbye"], ["AssignGoodbye"], ["ReplyBye"].
c_pick_Pick --> ["Pick"], c_onm_sayHello.
c_pick_Pick --> ["Pick"], c_onm_sayGoodbye.
c_main --> c_pick_Pick.


