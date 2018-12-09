

:-lib(ic).

fac(0,1).
fac(N,F):-
	N #> 0,
	N #=< F,
	N1 #= N - 1,
	F #= N * F1,
	fac(N1,F1).