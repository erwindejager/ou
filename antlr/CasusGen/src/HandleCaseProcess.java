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
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

public class HandleCaseProcess {
    public static void main(String[] args) throws Exception {
    	List<String> requirements = new ArrayList<>();
    	
    	
    	requirements.add(" "
    			+ "("
    			+ "<handleCaseInput.payload.id, '123'>,"
    			+ "<registerCaseReply.parameters.registerCaseReturn.ticketId,'456'>,"
    			+ "<handleCaseOutput.payload.result,'?'>"
    			+ ") "
    			+ "HandleRequest handleCase InitHandleCase HandleReceivedCaseRequest PrepareInvokeRegisterCase InvokeRegisterCase SaveTicket PrepareInvokeCreateCase InvokeCreateCase PrepareInvokeValidateCase InvokeValidateCase PrepareInvokeParkCase InvokeParkCase PrepareReplyHandleCase ReplyHandleCase"
    			+ " ("
    			+ "<handleCaseInput.payload.id, '123'>,"
    			+ "<registerCaseReply.parameters.registerCaseReturn.ticketId,'456'>,"
    			+ "<handleCaseOutput.payload.result,'456'>"
    			+ ")");

    	requirements.add(" "
    			+ "("
    			+ "<handleCaseInput.payload.id, '123'>,"
    			+ "<registerCaseReply.parameters.registerCaseReturn.ticketId,'456'>,"
    			+ "<handleCaseOutput.payload.result,'?'>,"
    			+ "<exception.fault.faultInfo.faultCode,'?'>"
    			+ ") "
			    + "HandleRequest handleCase InitHandleCase HandleReceivedCaseRequest PrepareInvokeRegisterCase InvokeRegisterCase PrepareRollback StopProcess"
			    + " ("
			    + "<handleCaseInput.payload.id, '123'>,"
			    + "<registerCaseReply.parameters.registerCaseReturn.ticketId,'456'>,"
			    + "<handleCaseOutput.payload.result,'?'>,"
    			+ "<exception.fault.faultInfo.faultCode,'-1'>"
			    + ")");
    	
    	requirements.add(" "
    			+ "("
    			+ "<handleCaseInput.payload.id, '123'>,"
    			+ "<registerCaseReply.parameters.registerCaseReturn.ticketId,'456'>,"
    			+ "<handleCaseOutput.payload.result,'?'>,"
    			+ "<exception.fault.faultInfo.faultCode,'?'>"
    			+ ") "
			    + "HandleRequest handleCase InitHandleCase HandleReceivedCaseRequest PrepareInvokeRegisterCase InvokeRegisterCase SaveTicket PrepareInvokeCreateCase InvokeCreateCase PrepareExceptionTask InvokeCreateExceptionTask StopProcess"
			    + " ("
			    + "<handleCaseInput.payload.id, '123'>,"
			    + "<registerCaseReply.parameters.registerCaseReturn.ticketId,'456'>,"
			    + "<handleCaseOutput.payload.result,'?'>,"
    			+ "<exception.fault.faultInfo.faultCode,'1'>"
			    + ")");
  	
    	requirements.add(" "
    			 + "("
    			 + "<handleObjectionInput.parameters.id, '123'>,"
				 + "<handleObjectionInput.parameters.type,'New'>,"
		         + "<registerObjectionCaseReply.parameters.registerObjectionCaseReturn.ticketId,'456'>,"
		         + "<handleObjectionOutput.parameters.result,'?'>"
		         + ") "
	             + "HandleRequest handleObjection InitHandleObjection elseif PrepareRegisterObjectionCase InvokeRegisterObjectionCase SaveObjectionTicket PrepareCreateObjectionCase InvokeCreateObjectionCase PrepareInvokeValidateObjectionCase InvokeValidateObjectionCase IfNewObjection PrepareCreateObjectionTask InvokeCreateObjectionTask PrepareReplyHandleObjection ReplyHandleObjection" 
		         + " ("
	             + "<handleObjectionInput.parameters.id, '123'>,"
				 + "<handleObjectionInput.parameters.type,'New'>,"
		         + "<registerObjectionCaseReply.parameters.registerObjectionCaseReturn.ticketId,'456'>,"
		         + "<handleObjectionOutput.parameters.result,'456'>"
	             + ")");

    	requirements.add(" "
    			 + "("
   			     + "<handleObjectionInput.parameters.id, '123'>,"
				 + "<handleObjectionInput.parameters.type,'WithDrawn'>,"
		         + "<registerObjectionCaseReply.parameters.registerObjectionCaseReturn.ticketId,'456'>,"
		         + "<handleObjectionOutput.parameters.result,'?'>"
		         + ") "
	             + "HandleRequest handleObjection InitHandleObjection elseif PrepareRegisterObjectionCase InvokeRegisterObjectionCase SaveObjectionTicket PrepareCreateObjectionCase InvokeCreateObjectionCase PrepareInvokeValidateObjectionCase InvokeValidateObjectionCase else PrepareInvokeStopObjectionCase InvokeStopObjectionCase PrepareReplyHandleObjection ReplyHandleObjection" 
		         + " ("
	             + "<handleObjectionInput.parameters.id, '123'>,"
				 + "<handleObjectionInput.parameters.type,'WithDrawn'>,"
		         + "<registerObjectionCaseReply.parameters.registerObjectionCaseReturn.ticketId,'456'>,"
		         + "<handleObjectionOutput.parameters.result,'456'>"
	             + ")");

    	requirements.add(" "
    			 + "("
      			 + "<handleParkedCaseInput.parameters.id, '123'>,"
   				 + "<handleParkedCaseInput.parameters.type,'D'>,"
   		         + "<handleParkedCaseOutput.parameters.result,'?'>"
   		         + ") "
   	             + "HandleRequest handleParkedCase InitHandleParkedCase elseif PrepareInvokeGetCalculation InvokeGetCalculation PrepareInvokeCheckProcessability InvokeCheckProcessability IfDegree PrepareInvokeCreatePayment InvokeCreatePayment PrepareInvokeSendLetter InvokeSendLetter PrepareInvokeEndCase InvokeEndCase PrepareReplyHandleParkedCase ReplyHandleParkedCase" 
   		         + " ("
   	             + "<handleParkedCaseInput.parameters.id, '123'>,"
   				 + "<handleParkedCaseInput.parameters.type,'D'>,"
   		         + "<handleParkedCaseOutput.parameters.result,'Ok'>"
   	             + ")");

    	requirements.add(" "
    			 + "("
     			 + "<handleParkedCaseInput.parameters.id, '123'>,"
  				 + "<handleParkedCaseInput.parameters.type,'P'>,"
  		         + "<handleParkedCaseOutput.parameters.result,'?'>"
  		         + ") "
  	             + "HandleRequest handleParkedCase InitHandleParkedCase elseif PrepareInvokeGetCalculation InvokeGetCalculation PrepareInvokeCheckProcessability InvokeCheckProcessability PrepareInvokeSendLetter InvokeSendLetter PrepareInvokeEndCase InvokeEndCase PrepareReplyHandleParkedCase ReplyHandleParkedCase" 
  		         + " ("
  	             + "<handleParkedCaseInput.parameters.id, '123'>,"
  				 + "<handleParkedCaseInput.parameters.type,'P'>,"
  		         + "<handleParkedCaseOutput.parameters.result,'Ok'>"
  	             + ")");

    	requirements.add(" "
    			+ "("
    			+ "<stopCaseInput.parameters.id, '123'>,"
    			+ "<stopCaseOutput.parameters.result, '?'>"
    			+ ") "
		   	    + "HandleRequest stopCase InitStopCase elseif PrepareInvokeStopCase InvokeStopCase PrepareReplyStopCase ReplyStopCase"
    			+ " ("
    			+ "<stopCaseInput.parameters.id, '123'>,"
    			+ "<stopCaseOutput.parameters.result, 'Ok'>"
    			+ ")");
   	

    	for (String s : requirements) {
        	testRequirement(s);    		
    	}
		
    }

	private static void testRequirement(String requirement) throws IOException {
		StringReader sr = new StringReader(requirement);
        BufferedReader br = new BufferedReader(sr);
        
		CodePointCharStream input = CharStreams.fromReader(br);
		
		HandleCaseProcessLexer lexer = new HandleCaseProcessLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		HandleCaseProcessParser parser = new HandleCaseProcessParser(tokens);
		
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
			ParseTree tree = parser.handlecaseprocess(); 
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		} catch (ParseCatchException e) {
			System.out.println("Handle catch : " + e.getMsg());
		}
	}
}