import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class RequestProcess {
    public static void main(String[] args) throws Exception {
    	List<String> requirements = new ArrayList<>();

    	requirements.add(" "
    			+ "("
    			+ "<handleRequestInput.parameters.payload, '123'>,"
    			+ "<classifyRequestWSResponse.parameters.classifyRequestReturn.value, 'S'>,"		    
    			+ "<checkProcessabilityWSResponse.parameters.checkProcessabilityReturn.value, 'V'>,"		    
    			+ "<handleRequestOutput.parameters.result, '?'>"
    			+ ") "
			    + "HandleService handleRequest PrepareHandleRequest HandleService PrepareClassifyRequest ClassifyRequestWS AssignRequestType IfStandardRequest PrepareCheckProcessability CheckProcessabilityWS AssignValid IfValid PrepareProcessRequest ProcessRequestWS NotReinjectHandleRequest PrepareHandleRequestReply HandleRequestReply"				
			    + " ("
    			+ "<handleRequestInput.parameters.payload, '123'>,"
    			+ "<classifyRequestWSResponse.parameters.classifyRequestReturn.value, 'S'>,"		    
    			+ "<checkProcessabilityWSResponse.parameters.checkProcessabilityReturn.value, 'V'>,"		    
    			+ "<handleRequestOutput.parameters.result, 'Ok'>"
			    + ")");

    	requirements.add(" "
    			+ "("
    			+ "<handleRequestInput.parameters.payload, '123'>,"
    			+ "<classifyRequestWSResponse.parameters.classifyRequestReturn.value, 'S'>,"		    
    			+ "<checkProcessabilityWSResponse.parameters.checkProcessabilityReturn.value, 'NV'>,"		    
    			+ "<handleRequestOutput.parameters.result, '?'>"
    			+ ") "
			    + "HandleService handleRequest PrepareHandleRequest HandleService PrepareClassifyRequest ClassifyRequestWS AssignRequestType IfStandardRequest PrepareCheckProcessability CheckProcessabilityWS AssignValid else PrepareRejectReq RejectRequestWS NotReinjectHandleRequest PrepareHandleRequestReply HandleRequestReply"				
			    + " ("
    			+ "<handleRequestInput.parameters.payload, '123'>,"
    			+ "<classifyRequestWSResponse.parameters.classifyRequestReturn.value, 'S'>,"		    
    			+ "<checkProcessabilityWSResponse.parameters.checkProcessabilityReturn.value, 'NV'>,"		    
    			+ "<handleRequestOutput.parameters.result, 'Ok'>"
			    + ")");

    	requirements.add(" "
    			+ "("
    			+ "<handleRequestInput.parameters.payload, '123'>,"
    			+ "<classifyRequestWSRequest.parameters.requestInput.payload, '?'>,"
    			+ "<classifyRequestWSResponse.parameters.classifyRequestReturn.value, 'C'>,"		    
    			+ "<handleRequestOutput.parameters.result, '?'>"
    			+ ") "
			    + "HandleService handleRequest PrepareHandleRequest HandleService PrepareClassifyRequest ClassifyRequestWS AssignRequestType else PrepareCreateManualTask CreateManualTaskWS NotReinjectHandleRequest PrepareHandleRequestReply HandleRequestReply"				
			    + " ("
    			+ "<handleRequestInput.parameters.payload, '123'>,"
    			+ "<classifyRequestWSRequest.parameters.requestInput.payload, '123'>,"
    			+ "<classifyRequestWSResponse.parameters.classifyRequestReturn.value, 'C'>,"		    
    			+ "<handleRequestOutput.parameters.result, 'Ok'>"
			    + ")");
    	
    	requirements.add(" "
    			+ "("
    			+ "<rejectRequestInput.parameters.payload, '123'>,"
    			+ "<rejectRequestOutput.parameters.result, '?'>"
    			+ ") "
			    + "HandleService rejectRequest PrepareRejectRequest elseif PrepareInvokeRejectRequest InvokeRejectRequestWS NotReinjectRejectRequest PrepareRejectRequestReply RejectRequestReply"
			    + " ("
    			+ "<rejectRequestInput.parameters.payload, '123'>,"
    			+ "<rejectRequestOutput.parameters.result, 'Ok'>"
			    + ")");
    	
    	requirements.add(" "
    			+ "("
    			+ "<rejectRequestInput.parameters.payload, '123'>,"
    			+ "<rejectRequestOutput.parameters.result, '?'>,"
    			+ "<createExceptionTaskWSRequest.parameters.requestInput.triggerEvent, '?'>"   			
    			+ ") "
			    + "HandleService rejectRequest PrepareRejectRequest elseif PrepareInvokeRejectRequest InvokeRejectRequestWS PrepareExceptionTask InvokeCreateExceptionTask StopProcess"
			    + " ("
    			+ "<rejectRequestInput.parameters.payload, '123'>,"
    			+ "<rejectRequestOutput.parameters.result, '?'>,"
    			+ "<createExceptionTaskWSRequest.parameters.requestInput.triggerEvent, 'rejectRequest'>"   			
			    + ")");
    	
    	requirements.add(" "
    			+ "("
    			+ "<reinjectRequestInput.parameters.service, 'rejectRequest'>,"
    			+ "<reinjectRequestInput.parameters.payload, '123'>,"
    			+ "<reinjectRequestOutput.parameters.result, '?'>"
    			+ ") "
			    + "HandleService reinjectRequest PrepareReinjectRequest elseif PrepareInvokeRejectRequest InvokeRejectRequestWS IfReinject PrepareReinjectRequestReply ReinjectRequestReply"
			    + " ("
    			+ "<reinjectRequestInput.parameters.service, 'rejectRequest'>,"
    			+ "<reinjectRequestInput.parameters.payload, '123'>,"
    			+ "<reinjectRequestOutput.parameters.result, 'Ok'>"
			    + ")");

    	requirements.add(" "
    			+ "("
    			+ "<reinjectRequestInput.parameters.service, 'rejectRequest'>,"
    			+ "<reinjectRequestInput.parameters.payload, '123'>,"
    			+ "<reinjectRequestOutput.parameters.result, '?'>,"
    			+ "<createExceptionTaskWSRequest.parameters.requestInput.triggerEvent, '?'>"   			
    			+ ") "
			    + "HandleService reinjectRequest PrepareReinjectRequest elseif PrepareInvokeRejectRequest InvokeRejectRequestWS PrepareExceptionTask InvokeCreateExceptionTask StopProcess"
			    + " ("
    			+ "<reinjectRequestInput.parameters.service, 'rejectRequest'>,"
    			+ "<reinjectRequestInput.parameters.payload, '123'>,"
    			+ "<reinjectRequestOutput.parameters.result, '?'>,"
    			+ "<createExceptionTaskWSRequest.parameters.requestInput.triggerEvent, 'rejectRequest'>"   			
			    + ")");

    	requirements.add(" "
    			+ "("
    			+ "<reinjectRequestInput.parameters.service, 'X'>,"
    			+ "<reinjectRequestInput.parameters.payload, '123'>,"
    			+ "<reinjectRequestOutput.parameters.result, '?'>"
    			+ ") "
			    + "HandleService reinjectRequest PrepareReinjectRequest else UnknownRequest IfReinject PrepareReinjectRequestReply ReinjectRequestReply"
			    + " ("
    			+ "<reinjectRequestInput.parameters.service, 'X'>,"
    			+ "<reinjectRequestInput.parameters.payload, '123'>,"
    			+ "<reinjectRequestOutput.parameters.result, 'Error'>"
			    + ")");

    	for (String s : requirements) {
        	testRequirement(s);    		
    	}
		
    }

	private static void testRequirement(String requirement) throws IOException {
		StringReader sr = new StringReader(requirement);
        BufferedReader br = new BufferedReader(sr);
        
		CodePointCharStream input = CharStreams.fromReader(br);
		
		HandleRequestLexer lexer = new HandleRequestLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		HandleRequestParser parser = new HandleRequestParser(tokens);
		
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
		
		parser.setErrorHandler(new BailErrorStrategy());
		
		try {
			ParseTree tree = parser.handlerequest();
			
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		} catch (ParseCatchException e) {
			System.out.println("Handle catch : " + e.getMsg());
		} catch (Exception e) {
			System.out.println("Parse exception : " + e.getCause());			
		}
	}
}