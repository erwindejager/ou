
:-lib(ic).

% phrase(picksample([Erwin],X,[])

picksample(V0) --> V0,[Pick, sayHello, AssignHello, replyHello], [Hello, V0].
picksample(V0) --> V0,[Pick, sayGoodbye, AssignGoodbye, ReplyBye], [Goodbye, V0].

