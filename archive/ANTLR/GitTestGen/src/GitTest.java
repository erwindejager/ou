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

public class GitTest {
    public static void main(String[] args) throws Exception {
    	List<String> requirements = new ArrayList<>();

    	requirements.add("(<input.payload.input, '0'>,<output.payload.result,'?'>) receiveInput Assign replyOutput" +   
    			         "(<input.payload.input, '0'>,<output.payload.result,'0'>)");
    	
    	requirements.add("(<input.payload.input, '0'>,<output.payload.result,'?'>) receiveInput Assign replyOutput" +   
		         "(<input.payload.input, '0'>,<output.payload.result,'1'>)");

    	for (String s : requirements) {
        	testRequirement(s);    		
    	}
		
    }

	private static void testRequirement(String requirement) throws IOException {
		StringReader sr = new StringReader(requirement);
        BufferedReader br = new BufferedReader(sr);
        
		CodePointCharStream input = CharStreams.fromReader(br);
		
		GitTestLexer lexer = new GitTestLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		GitTestParser parser = new GitTestParser(tokens);
		
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
		
		ParseTree tree = parser.gittest(); 
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
}