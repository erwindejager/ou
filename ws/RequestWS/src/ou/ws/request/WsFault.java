package ou.ws.request;

public class WsFault {

	private String faultCode;
	private String faultString;

	public WsFault() {
		super();
	}

	public WsFault(String faultCode, String faultString) {
		super();
		this.faultCode = faultCode;
		this.faultString = faultString;
	}

	public String getFaultCode() {
		return faultCode;
	}

	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}

	public String getFaultString() {
		return faultString;
	}

	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}

}
