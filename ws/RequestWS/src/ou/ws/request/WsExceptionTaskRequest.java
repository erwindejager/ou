package ou.ws.request;

import java.io.Serializable;

public class WsExceptionTaskRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String payload;
	private String triggerEvent;
	private String exceptionPoint;
		
	public WsExceptionTaskRequest() {
		super();
	}

	public WsExceptionTaskRequest(String payload, String triggerEvent, String exceptionPoint) {
		super();
		this.payload = payload;
		this.triggerEvent = triggerEvent;
		this.setExceptionPoint(exceptionPoint);
	}
		
	public String getPayload() {
		return this.payload;
	}
	
	public void setPayload(String payload) {
		this.payload = payload;
	}
	
	public String getTriggerEvent() {
		return triggerEvent;
	}
	
	public void setTriggerEvent(String triggerEvent) {
		this.triggerEvent = triggerEvent;
	}

	public String getExceptionPoint() {
		return exceptionPoint;
	}

	public void setExceptionPoint(String exceptionPoint) {
		this.exceptionPoint = exceptionPoint;
	}
	
}
