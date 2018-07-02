package ou.ws.casus;

import java.io.Serializable;

public class WsExceptionTaskRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String triggerEvent;
	private String exceptionPoint;
		
	public WsExceptionTaskRequest() {
		super();
	}

	public WsExceptionTaskRequest(String id, String triggerEvent, String exceptionPoint) {
		super();
		this.id = id;
		this.triggerEvent = triggerEvent;
		this.setExceptionPoint(exceptionPoint);
	}
		
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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
