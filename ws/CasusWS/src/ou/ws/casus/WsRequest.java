package ou.ws.casus;

import java.io.Serializable;

public class WsRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String errorIndicator;
	
	
	public WsRequest() {
		super();
	}

	public WsRequest(String id, String errorIndicator) {
		super();
		this.id = id;
		this.errorIndicator = errorIndicator;
	}
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getErrorIndicator() {
		return errorIndicator;
	}
	public void setErrorIndicator(String errorIndicator) {
		this.errorIndicator = errorIndicator;
	}
	
}
