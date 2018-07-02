package ou.ws.casus;

import java.io.Serializable;

public class WsResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public WsResponse() {
		super();
	}

	static public WsResponse create() {
		return new WsResponse();
	}
		
}
