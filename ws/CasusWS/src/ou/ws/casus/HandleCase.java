package ou.ws.casus;

public class HandleCase {
	
	public WsRegisterResponse registerCase(WsRegisterRequest requestInput) throws WsException {
		return WsUtils.handleRegisterServiceRequest(requestInput, "registerCase");
	}
	
	public WsResponse createCase(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "createCase");
	}
	
	public WsResponse validateCase(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "validateCase");
	}

	public WsResponse parkCase(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "parkCase");
	}

	public WsResponse stopCase(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "stopCase");
	}
	
	public WsResponse getCalculation(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "getCalculation");
	}
	
	public WsResponse checkProcessability(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "checkProcessability");
	}
	
	public WsResponse createPayment(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "createPayment");
	}
	
	public WsResponse sendLetter(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "sendLetter");
	}

	public WsResponse endCase(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "endCase");
	}

	public WsRegisterResponse registerObjectionCase(WsRegisterRequest requestInput) throws WsException {
		return WsUtils.handleRegisterServiceRequest(requestInput, "registerObjectionCase");
	}
	
	public WsResponse createObjectionCase(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "createObjectionCase");
	}
	
	public WsResponse validateObjectionCase(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "validateObjectionCase");
	}

	public WsResponse createObjectionTask(WsRequest requestInput) throws WsException {
		return WsUtils.handleServiceRequest(requestInput, "createObjectionTask");
	}

	public WsResponse createExceptionTask(WsExceptionTaskRequest requestInput) throws WsException {
		return WsUtils.handleExceptionTaskRequest(requestInput, "createExceptionTask");
	}
}
