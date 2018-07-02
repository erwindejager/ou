package ou.ws.casus;

import javax.xml.ws.WebFault;

@WebFault(name="WsFault",targetNamespace="http://handlecase.casus.ws.ou")
public class WsException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private WsFault fault;

	public WsException() {
	}

	protected WsException(WsFault fault) {
        super(fault.getFaultString()); 
        this.fault = fault;
     }

	public WsException(String message, WsFault faultInfo){
		super(message);
        this.fault = faultInfo;
	}

	public WsException(String message, WsFault faultInfo, Throwable cause){
		super(message,cause);
        this.fault = faultInfo;
	}

	public WsFault getFaultInfo(){
		return fault;
	}
	
	public WsException(String message) {
		super(message);
	}

	public WsException(String code, String message) {
		super(message);
		this.fault = new WsFault(message, message);
	}

	public WsException(Throwable cause) {
		super(cause);
	}

	public WsException(String message, Throwable cause) {
		super(message, cause);
	}	
}
