% findall(X, phrase(grammar_IfElse,X,[]),AS),forall((member(N,AS)), writeln(N)).

%% Automatically generated by EDJ BPEL2DCG Transformer : Fri Nov 30 15:11:20 CET 2018

grammar_IfElse --> ["v0"], c_main, ["v"].

c_if_If_0 --> ["If_0"], ["Assign_1"], ["replyIf"].
c_if_If_0 --> ["else"], ["Assign_0"], ["ReplyElse"].
c_main --> ["receive"], c_if_If_0.

handleRule(OS,N) :- not(member("@END@", N)), writeln(OS, N).
handleRule(OS,N) :- member("@END@", N), stripRule("@END@", N, N1), writeln(OS, N1).

stripRule(_, [], []). 
stripRule(T, [T|_], ["v"]). 
stripRule(T, [X|L], [X|NL]) :- stripRule(T, L, NL). 

stripRules([],[]).
stripRules([X|L],[X1|L1]) :- stripRule("@END@", X, X1), stripRules(L, L1).

start:-
    open('IfElse.txt',write,OS),
	findall(X, phrase(grammar_IfElse,X,[]),AS),
	stripRules(AS,AS1),
	list_to_set(AS1, AsSet),
    forall((member(N,AsSet)), handleRule(OS,N)),
    close(OS).

