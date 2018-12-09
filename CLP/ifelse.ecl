% IF X=0 THEN Y=1 ELSE Y=0

ifelse(X,1) :- X=0, !.
ifelse(X,0) :- not X=0.
