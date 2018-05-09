% ifelse([in,out],[expected in,expected out]) if in==0 then out=1 else out=o
phrase(ifelse([0,?],[0,1]),X,[]) --> result: X = [0, ?, if_0, assign_1, replyif, 0, 1]
phrase(ifelse([0,?],[0,1]),[0, ?, if_0, assign_1, replyif, 0, 1],[]) --> result: YES
phrase(ifelse([1,?],[0,1]),X,[]) --> result: NO
phrase(ifelse([1,?],[1,0]),X,[]) --> result: X = [1, ?, else, assign_0, replyelse, 1, 0]

% whilesample([in,[out]]) will loop five times out = [in,in,in,in,in]
phrase(whilesample([a,[?]]),X,[]) --> result: X = [a, [?], receiveinput, assign, loopassign, loopassign, loopassign, loopassign, loopassign, assignoutput, replyOutput, a, [a, a, a, a, a]]
phrase(whilesample([a,[?]]),[a, [?], receiveinput, assign, loopassign, loopassign, loopassign, loopassign, loopassign, assignoutput, replyOutput, a, [a, a, a, a, a]],[]) --> result: YES 
phrase(whilesample([a,[?]]),[a, [?], receiveinput, assign, loopassign, loopassign, loopassign, loopassign, loopassign, assignoutput, replyOutput, a, [a, a, a, a, b]],[]) --> result: NO 
phrase(whilesample([a,[?]]),[a, [?], receiveinput, assign, loopassign, loopassign, loopassign, loopassign, assignoutput, replyOutput, a, [a, a, a, a]],[]) --> result: NO 

phrase(picksample([Erwin]),X,[]) --> result: X = [Erwin, pick, sayHello, assignHello, replyHello, hello, Erwin]
                                             X = [Erwin, pick, sayGoodbye, assignGoodbye, replyBye, goodbye, Erwin]
phrase(picksample([Erwin]),[Erwin, pick, sayGoodbye, assignGoodbye, replyBye, goodbye, Erwin],[]) --> result: YES

%increment integer
phrase(invokeincrementprocess([10]),X,[]) --> result: X = [10, prepareInvokeIncrement, invoke, prepareOutput, replyOutput, 11]

% input List(Person(name,age)), output : length of List + last Person in List
phrase(complextarray([[pipo,100],[mamalou,110]]),X,[])  --> result: X = [[pipo, 100], [mamalou, 110], receiveInput, assign, replyOutput, 2, [mamalou, 110]]
phrase(complextarray([[pipo,100],[mamalou,110]]),[[pipo, 100], [mamalou, 110], receiveInput, assign, replyOutput, 2, [mamalou, 110]],[])  --> result: YES
phrase(complextarray([[pipo,100],[mamalou,110]]),[[pipo, 100], [mamalou, 110], receiveInput, assign, replyOutput, 1, [mamalou, 110]],[])  --> result: NO
phrase(complextarray([[pipo,100],[mamalou,110]]),[[pipo, 100], [mamalou, 110], receiveInput, assign, replyOutput, 2, [mamalou, 100]],[])  --> result: NO

