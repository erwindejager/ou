import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ParseCatchException extends ParseCancellationException {

	private static final long serialVersionUID = 1L;
	
	private String msg;

	public ParseCatchException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
}
