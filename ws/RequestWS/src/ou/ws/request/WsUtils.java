package ou.ws.request;

public class WsUtils {
	
	public static WsResponse handleServiceRequest(WsRequest requestInput, String method) throws WsException {
		Logger.logInvoke(method, requestInput.getPayload());
		return WsResponse.create();
	}
	
	public static WsResponse handleExceptionTaskRequest(WsExceptionTaskRequest requestInput, String method) throws WsException {
		Logger.logInvoke(method, requestInput.getPayload());
		return WsResponse.create();
	}

}
