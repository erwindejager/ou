
:-lib(ic).

% phrase(invokeincrementprocess([10]),X,[])

invokeincrementprocess([V0]) --> [V0], [prepareInvokeIncrement, invoke, prepareOutput,replyOutput], {V #= V0 + 1}, [V].


