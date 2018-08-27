package ou.ws.request;

public class HandleRequestWS {
	
	public WsResponse classifyRequest(WsRequest requestInput) throws WsException {
		WsResponse resp = WsUtils.handleServiceRequest(requestInput, "classifyRequest");
		resp.setValue("S"); // OR "C"
		return resp;
	}
	
	public WsResponse checkProcessability(WsRequest requestInput) throws WsException {
		WsResponse resp =  WsUtils.handleServiceRequest(requestInput, "checkProcessability");
		resp.setValue("V"); // OR "NV"
		return resp;
	}
	
	public WsResponse processRequest(WsRequest requestInput) throws WsException {
		WsResponse resp =  WsUtils.handleServiceRequest(requestInput, "processRequest");
		resp.setValue("Ok");
		return resp;
	}

	public WsResponse rejectRequestWS(WsRequest requestInput) throws WsException {
		WsResponse resp =  WsUtils.handleServiceRequest(requestInput, "rejectRequest");
		resp.setValue("Ok");
		return resp;
	}

	public WsResponse createManualTask(WsRequest requestInput) throws WsException {
		WsResponse resp =  WsUtils.handleServiceRequest(requestInput, "createManualTask");
		resp.setValue("Ok");
		return resp;
	}

	public WsResponse createExceptionTask(WsExceptionTaskRequest requestInput) throws WsException {
		return WsUtils.handleExceptionTaskRequest(requestInput, "createExceptionTask");
	}
}
