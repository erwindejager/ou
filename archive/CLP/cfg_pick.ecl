
:-lib(ic).

% phrase(picksample([Erwin]),X,[])

picksample(V0) --> V0,[pick, sayHello, assignHello, replyHello], [hello], V0.
picksample(V0) --> V0,[pick, sayGoodbye, assignGoodbye, replyBye], [goodbye], V0.

