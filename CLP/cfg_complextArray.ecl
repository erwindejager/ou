
:-lib(ic).

% phrase(complextarray([[pipo,100],[mamalou,110]]),X,[])

complextarray(V0) --> V0,[receiveInput, assign, replyOutput], total(V0), last(V0).
total(L) --> {length(L, N)}, [N].
last(L) --> {reverse(L, [H|T])}, [H].
