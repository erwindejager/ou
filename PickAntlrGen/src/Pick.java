/***
 * Excerpted from "The Definitive ANTLR Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr for more book information.
***/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Pick {
    public static void main(String[] args) throws Exception {
    	List<String> requirements = new ArrayList<>();
    	
    	requirements.add("([input.payload.input, 'mamalou']        ,[output.payload.result,'?']," + 
    	                  "[clientRequest.parameters.in,'?'] ,[clientResponse.parameters.out,'?'])" +
    	                  "Pick sayHello AssignHello replyHello" +   
    	                  "([input.payload.input, 'mamalou']       ,[output.payload.result,'Hello mamalou']," + 
    	    	          "[clientRequest.parameters.in,'?'] ,[clientResponse.parameters.out,'?'])");

    	requirements.add("([input.payload.input, '?']          ,[output.payload.result,'?']," + 
    					 "[clientRequest.parameters.in,'pipo'] ,[clientResponse.parameters.out,'?'])" +
    					 "Pick sayGoodbye AssignGoodbye ReplyBye" +   
                         "([input.payload.input, '?']          ,[output.payload.result,'?']," + 
  	                     "[clientRequest.parameters.in,'pipo'] ,[clientResponse.parameters.out,'Goodbye pipo'])");
    	
    	requirements.add("([input.payload.input, 'pipo']        ,[output.payload.result,'?']," + 
    					 "[clientRequest.parameters.in,'?'] ,[clientResponse.parameters.out,'?'])" +
    					 "Pick sayHello AssignHello replyHello" +   
    					 "([input.payload.input, 'pipo']       ,[output.payload.result,'Bye pipo']," + 
  	          			 "[clientRequest.parameters.in,'?'] ,[clientResponse.parameters.out,'?'])");

    	requirements.add("([input.payload.input, '?']          ,[output.payload.result,'?']," + 
				 		 "[clientRequest.parameters.in,'pipo'] ,[clientResponse.parameters.out,'?'])" +
				 		 "Pick sayGoodbye AssignGoodbye ReplyBye" +   
				 		 "([input.payload.input, '?']          ,[output.payload.result,'?']," + 
                 		 "[clientRequest.parameters.in,'pipo'] ,[clientResponse.parameters.out,'Hello pipo'])");
    	
    	for (String s : requirements) {
        	testRequirement(s);    		
    	}
		
    }

    private static void testRequirement(String requirement) throws IOException {
		StringReader sr = new StringReader(requirement);
        BufferedReader br = new BufferedReader(sr);
        
		CodePointCharStream input = CharStreams.fromReader(br);
		
		PickSampleLexer lexer = new PickSampleLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		PickSampleParser parser = new PickSampleParser(tokens);
		
		List<String> syntaxErrors = new ArrayList<>();
		
		parser.removeErrorListeners();
		parser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(org.antlr.v4.runtime.Recognizer<?,?> recognizer, 
					java.lang.Object offendingSymbol, int line, int charPositionInLine, 
					java.lang.String msg, org.antlr.v4.runtime.RecognitionException e) {
				syntaxErrors.add(msg);
				System.out.println(msg);
			}			
		});		
		
		ParseTree tree = parser.picksample(); 
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
}