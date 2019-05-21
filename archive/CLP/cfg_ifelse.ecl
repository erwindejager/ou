
:-lib(ic).

ifelse(V0,V) --> V0,{constr_if(V0,V)},[if_0, assign_1, replyif], V.
ifelse(V0,V) --> V0,{constr_else(V0,V)},[else, assign_0, replyelse], V.

constr_if([X0,Y0],[X,Y]) :- X0 #= 0, Y #= 1, X0 #= X.
constr_else([X0,Y0],[X,Y]) :- X0 #\= 0, Y #= 0, X0 #= X.
