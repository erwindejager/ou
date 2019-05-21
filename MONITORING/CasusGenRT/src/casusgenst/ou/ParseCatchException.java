package casusgenst.ou;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ParseCatchException extends ParseCancellationException {

	private static final long serialVersionUID = 1L;
	
	private String msg;
	private boolean error;

	public ParseCatchException(String msg, boolean errorInd) {
		this.msg = msg;
		this.error = errorInd;
	}

	public String getMsg() {
		return msg;
	}

	public boolean isError() {
		return error;
	}
}
