package ou.ws.casus;

public class WsRegisterRequest extends WsRequest {

	private static final long serialVersionUID = 1L;
	
	private String type;

	public WsRegisterRequest() {
		super();
	}

	public WsRegisterRequest(String id, String type, String errorIndicator) {
		super(id, errorIndicator);
		this.type = type;
	}
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
