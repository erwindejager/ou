package ou.ws.request;

import java.io.Serializable;

public class WsResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String value;
	
	public WsResponse() {
		super();
	}

	static public WsResponse create() {
		return new WsResponse();
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
