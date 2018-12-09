% S::=SS | (S) |
:- lib(ic).
:- use_module(library(ic)).

p --> q1.
p --> q2.
p --> q3.
q1 --> [].
q2 --> ['('],p,[')'].
q3 --> p,p.


px(X) --> qx1(X).
px(X) --> qx2(X), X<3.
px(X) --> qx3(X), X<3.
qx1(X) --> [].
qx2(X) --> ['('],px(X+1),[')'].
qx3(X) --> px(X+1),px(X+1).


as --> [].
as --> [a], as.

