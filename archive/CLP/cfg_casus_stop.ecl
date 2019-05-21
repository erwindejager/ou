
:-lib(ic).

% phrase(stopcase1,X,[]).
%phrase(s3(["a"],["b"]),X,[])

%complextarray(V0) --> V0,[receiveInput, assign, replyOutput], total(V0), last(V0).
%total(L) --> {length(L, N)}, [N].
%last(L) --> {reverse(L, [H|T])}, [H].

stopCase([V0]) --> [V0], ["HandleRequest", "stopCase", "InitStopCase", "elseif", "PrepareInvokeStopCase", "InvokeStopCase", "PrepareReplyStopCase", "ReplyStopCase"], [V0].
stopCase1 --> v0,["HandleRequest", "stopCase", "InitStopCase", "elseif", "PrepareInvokeStopCase", "InvokeStopCase", "PrepareReplyStopCase", "ReplyStopCase"].

%rstopcase(V0) --> [V0],[handleRequest stopCase initStopCase elseif PrepareInvokeStopCase InvokeStopCase PrepareReplyStopCase ReplyStopCase].
v0 --> {findall(X,phrase(kvp(["stopCaseInput.parameters.id"],["123"]),X,[]),AS)}, AS.

%phrase(s1,X,[])
s1 --> ["123", ""].
s2 --> ["OK","Ok",""].
 
%phrase(cc(["pipo", "klukluk"],["mamalou","???"]),X,[])
%findall(X,phrase(cc(["pipo", "klukluk"],["mamalou","???"]),X,[]),AS)
%findall(X,phrase(cc(["stopCaseInput.parameters.id"],["OK","Ok", ""]),X,[]),AS)

s3([S1],[S2]) --> { string_concat(S1, S2, S3) }, [S3]. 
cc(L1,L2) --> {member(X,L1), member(Y,L2), string_concat(X, Y, S)}, [S].

%findall(X,phrase(kvp(["stopCaseInput.parameters.id"],["OK","Ok", ""]),X,[]),AS)

kvp(L1,L2) --> {	member(X,L1), member(Y,L2), 
					string_concat("<", X, Xprefix), 
					string_concat(Xprefix, ",'", Xformated), 
					string_concat(Y, "'>", Ypostfix),
					string_concat(Xformated, Ypostfix, S)}, [S].

					
					
%   			+ "("
%   			+ "<stopCaseInput.parameters.id, '123'>"
%    			+ "<stopCaseOutput.parameters.result, '?'>"
%    			+ ") "
%		   	    + "HandleRequest stopCase InitStopCase elseif PrepareInvokeStopCase InvokeStopCase PrepareReplyStopCase ReplyStopCase"
%    			+ " ("
%    			+ "<stopCaseInput.parameters.id, '123'>,"
%    			+ "<stopCaseOutput.parameters.result, 'Ok'>"
%    			+ ")");
