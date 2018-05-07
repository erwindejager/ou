phrase(ifelse([0,?],[0,1]),X,[]) --> result: X = [0, ?, if_0, assign_1, replyif, 0, 1]
phrase(ifelse([0,?],[0,1]),[0, ?, if_0, assign_1, replyif, 0, 1],[]) --> result: YES
phrase(ifelse([1,?],[0,1]),X,[]) --> result: NO
phrase(ifelse([1,?],[1,0]),X,[]) --> result: X = [1, ?, else, assign_0, replyelse, 1, 0]

phrase(whilesample([a,[?]]),X,[]) --> result: X = [a, [?], receiveinput, assign, loopassign, loopassign, loopassign, loopassign, loopassign, assignoutput, replyOutput, a, [a, a, a, a, a]]
phrase(whilesample([a,[?]]),[a, [?], receiveinput, assign, loopassign, loopassign, loopassign, loopassign, loopassign, assignoutput, replyOutput, a, [a, a, a, a, a]],[]) --> result: YES 
phrase(whilesample([a,[?]]),[a, [?], receiveinput, assign, loopassign, loopassign, loopassign, loopassign, loopassign, assignoutput, replyOutput, a, [a, a, a, a, b]],[]) --> result: NO 
phrase(whilesample([a,[?]]),[a, [?], receiveinput, assign, loopassign, loopassign, loopassign, loopassign, assignoutput, replyOutput, a, [a, a, a, a]],[]) --> result: NO 
