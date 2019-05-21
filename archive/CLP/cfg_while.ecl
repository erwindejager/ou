
:-lib(ic).

% phrase(whilesample([a,[?]],X,[])

whilesample(V0) --> V0,[receiveinput, assign], whilex(V0), v(V0,[],0).
whilex(V0) --> whilex_block_seq(V0,0), post_whilex.
whilex_block_seq(V0,5) --> [].
whilex_block_seq(V0,IT) --> {IT1 #= IT + 1}, whilex_block(V0,IT), whilex_block_seq(V0,IT1).
whilex_block(V0,IT) --> { IT #>= 0 ,IT #< 5 }, [loopassign].
post_whilex --> [assignoutput, replyOutput].
v([X0,Y0],L,5) --> [X0,L].  
v([X0,Y0],L,IT) --> { IT #>= 0 ,IT #< 5, IT1 #= IT + 1 }, v([X0,Y0],[X0|L],IT1).
