package ou.ws.request;

import java.io.Serializable;

public class WsRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String payload;
	
	
	public WsRequest() {
		super();
	}

	public WsRequest(String payload) {
		super();
		this.payload = payload;
	}
		
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
}
