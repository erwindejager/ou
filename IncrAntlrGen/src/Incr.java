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

public class Incr {
    public static void main(String[] args) throws Exception {
    	List<String> requirements = new ArrayList<>();
    	requirements.add("(<input.payload.input, '0'> ,<incrementPLRequest.parameters.i,'0'>," + 
                		 "<incrementPLResponse.parameters.incrReturn,'1'> ,<output.payload.result,'?'>)" +
                		 "receiveInput PrepareInvokeIncrement Invoke PrepareOutput replyOutput" +   
                		 "(<input.payload.input, '0'> ,<incrementPLRequest.parameters.i,'0'>," + 
                		 "<incrementPLResponse.parameters.incrReturn,'1'> ,<output.payload.result,'1'>)");
	
    	requirements.add("(<input.payload.input, '0'> ,<incrementPLRequest.parameters.i,'0'>," + 
       		 "<incrementPLResponse.parameters.incrReturn,'10'> ,<output.payload.result,'?'>)" +
       		 "receiveInput PrepareInvokeIncrement Invoke PrepareOutput replyOutput" +   
       		 "(<input.payload.input, '0'> ,<incrementPLRequest.parameters.i,'0'>," + 
       		 "<incrementPLResponse.parameters.incrReturn,'10'> ,<output.payload.result,'1'>)");

    	requirements.add("(<input.payload.input, '0'> ,<incrementPLRequest.parameters.i,'0'>," + 
          		 "<incrementPLResponse.parameters.incrReturn,'10'> ,<output.payload.result,'?'>)" +
          		 "receiveInput PrepareInvokeIncrement Invoke PrepareOutput replyOutput" +   
          		 "(<input.payload.input, '0'> ,<incrementPLRequest.parameters.i,'0'>," + 
          		 "<incrementPLResponse.parameters.incrReturn,'10'> ,<output.payload.result,'11'>)");
    	
    	for (String s : requirements) {
        	testRequirement(s);    		
    	}
		
    }

    private static void testRequirement(String requirement) throws IOException {
		StringReader sr = new StringReader(requirement);
        BufferedReader br = new BufferedReader(sr);
        
		CodePointCharStream input = CharStreams.fromReader(br);
		
		InvokeIncrementProcessLexer lexer = new InvokeIncrementProcessLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		InvokeIncrementProcessParser parser = new InvokeIncrementProcessParser(tokens);
		
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
		
		ParseTree tree = parser.invokeincrementprocess(); 
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
}