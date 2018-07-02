package ou.ws.casus;

import java.util.UUID;

public class WsRegisterResponse extends WsResponse {

	private static final long serialVersionUID = 1L;
	
	private String ticketId;
	
	public WsRegisterResponse() {
		super();
	}

	public WsRegisterResponse(String ticketId) {
		super();
		this.ticketId = ticketId;
	}

	static public WsRegisterResponse create() {
		return new WsRegisterResponse(UUID.randomUUID().toString());
	}
	
	public String getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	
}
