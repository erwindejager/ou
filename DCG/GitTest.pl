% findall(X, phrase(grammar_GitTest,X,[]),AS),forall((member(N,AS)), writeln(N)).

%% Automatically generated by EDJ BPEL2DCG Transformer : Fri Nov 30 15:08:16 CET 2018

grammar_GitTest --> ["v0"], c_main, ["v"].

c_main --> ["receiveInput"], ["Assign"], ["replyOutput"].
