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

public class ComplextArraySample {
    public static void main(String[] args) throws Exception {
    	List<String> requirements = new ArrayList<>();
    	
    	requirements.add("(<input.payload.input[1].name, 'mamalou'>, <input.payload.input[1].age, '90'>," + 
    					  "<input.payload.input[2].name, 'pipo'>, <input.payload.input[2].age, '100'>," +
    					  "<output.payload.result.name,'?'>, <output.payload.result.age,'0'>," +
    					  "<output.payload.total,'0'>)" +
    					  "receiveInput Assign replyOutput" +  
    					  "(<input.payload.input[1].name, 'mamalou1'>, <input.payload.input[1].age, '91'>," +
    					  "<input.payload.input[2].name, 'pipo1'>, <input.payload.input[2].age, '101'>," +
    					  "<output.payload.result.name,'pipo2'>, <output.payload.result.age, '101'>," +
                		  "<output.payload.total, '3'>)");    	                  

    	requirements.add("(<input.payload.input[1].name, 'mamalou'>, <input.payload.input[1].age, '90'>," + 
    			          "<input.payload.input[2].name, 'pipo'>, <input.payload.input[2].age, '100'>," +
    	                  "<output.payload.result.name,'?'>, <output.payload.result.age,'0'>," +
    	                  "<output.payload.total,'0'>)" +
    	                  "receiveInput Assign replyOutput" +  
  	                      "(<input.payload.input[1].name, 'mamalou'>, <input.payload.input[1].age, '90'>," +
  	                      "<input.payload.input[2].name, 'pipo'>, <input.payload.input[2].age, '100'>," +
    	                  "<output.payload.result.name,'pipo'>, <output.payload.result.age, '100'>," +
    	                  "<output.payload.total, '2'>)");    	                  
    	
    	for (String s : requirements) {
        	testRequirement(s);    		
    	}
		
    }

	private static void testRequirement(String requirement) throws IOException {
		StringReader sr = new StringReader(requirement);
        BufferedReader br = new BufferedReader(sr);
        
		CodePointCharStream input = CharStreams.fromReader(br);
		
		ComplextArraySampleLexer lexer = new ComplextArraySampleLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		ComplextArraySampleParser parser = new ComplextArraySampleParser(tokens);
		
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
		
		ParseTree tree = parser.complextarraysample(); 
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
}