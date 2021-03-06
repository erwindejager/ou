%% findall(X, phrase(grammar_InvokeIncrementProcess,X,[]),AS),forall((member(N,AS)), writeln(N)).

%% Automatically generated by EDJ BPEL2DCG Transformer : Fri Nov 30 15:05:36 CET 2018

grammar_InvokeIncrementProcess --> ["v0"], c_main, ["v"].

c_main --> ["receiveInput"], ["PrepareInvokeIncrement"], ["Invoke"], ["PrepareOutput"], ["replyOutput"].


handleRule(OS,N) :- not(member("@END@", N)), writeln(OS, N).
handleRule(OS,N) :- member("@END@", N), stripRule("@END@", N, N1), writeln(OS, N1).

stripRule(_, [], []). 
stripRule(T, [T|_], ["v"]). 
stripRule(T, [X|L], [X|NL]) :- stripRule(T, L, NL). 

stripRules([],[]).
stripRules([X|L],[X1|L1]) :- stripRule("@END@", X, X1), stripRules(L, L1).

start:-
    open('InvokeIncrementProcess.txt',write,OS),
	findall(X, phrase(grammar_InvokeIncrementProcess,X,[]),AS),
	stripRules(AS,AS1),
	list_to_set(AS1, AsSet),
    forall((member(N,AsSet)), handleRule(OS,N)),
    close(OS).
