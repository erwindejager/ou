% findall(X, phrase(grammar_PickSample,X,[]),AS),forall((member(N,AS)), writeln(N)).

%% Automatically generated by EDJ BPEL2DCG Transformer : Fri Nov 30 15:09:32 CET 2018

grammar_PickSample --> ["v0"], c_main, ["v"].

c_onm_sayHello --> ["sayHello"], ["AssignHello"], ["replyHello"].
c_onm_sayGoodbye --> ["sayGoodbye"], ["AssignGoodbye"], ["ReplyBye"].
c_pick_Pick --> ["Pick"], c_onm_sayHello.
c_pick_Pick --> ["Pick"], c_onm_sayGoodbye.
c_main --> c_pick_Pick.


handleRule(OS,N) :- not(member("@END@", N)), writeln(OS, N).
handleRule(OS,N) :- member("@END@", N), stripRule("@END@", N, N1), writeln(OS, N1).

stripRule(_, [], []). 
stripRule(T, [T|_], ["v"]). 
stripRule(T, [X|L], [X|NL]) :- stripRule(T, L, NL). 

stripRules([],[]).
stripRules([X|L],[X1|L1]) :- stripRule("@END@", X, X1), stripRules(L, L1).

start:-
    open('PickSample.txt',write,OS),
	findall(X, phrase(grammar_PickSample,X,[]),AS),
	stripRules(AS,AS1),
	list_to_set(AS1, AsSet),
    forall((member(N,AsSet)), handleRule(OS,N)),
    close(OS).


