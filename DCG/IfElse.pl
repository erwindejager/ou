% findall(X, phrase(grammar_IfElse,X,[]),AS),forall((member(N,AS)), writeln(N)).

%% Automatically generated by EDJ BPEL2DCG Transformer : Fri Nov 30 15:11:20 CET 2018

grammar_IfElse --> ["v0"], c_main, ["v"].

c_if_If_0 --> ["If_0"], ["Assign_1"], ["replyIf"].
c_if_If_0 --> ["else"], ["Assign_0"], ["ReplyElse"].
c_main --> ["receive"], c_if_If_0.
