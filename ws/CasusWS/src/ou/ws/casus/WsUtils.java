package ou.ws.casus;

import casusgenst.ou.Utils;

public class WsUtils {
	
	public static WsRegisterResponse handleRegisterServiceRequest(WsRequest requestInput, String method)
			throws WsException {
		handleErrorIndicator(method, requestInput.getId(), HandlingIndicator.getEnum(requestInput.getErrorIndicator()));
		return WsRegisterResponse.create();
	}
	
	public static WsResponse handleServiceRequest(WsRequest requestInput, String method) throws WsException {
		handleErrorIndicator(method, requestInput.getId(), HandlingIndicator.getEnum(requestInput.getErrorIndicator()));
		return WsResponse.create();
	}
	
	public static WsResponse handleExceptionTaskRequest(WsExceptionTaskRequest requestInput, String method) throws WsException {
		Logger.logInvoke(method, requestInput.getId());
		return WsResponse.create();
	}
	
	public static WsResponse handelParseProcesInstance(WsRequest requestInput) throws WsException {
		//Logger.logInvoke("parseProcesInstance", "0");
		try {
			String[] path = requestInput.getId().split("\\)");
			path = path[1].split("\\(");
			String result = "FAIL:   ";
			int retVal = Utils.testRequirement(requestInput.getId(), 0);
			if (retVal > 0) {
				result = "PASSED: ";
			}
			System.out.printf("%s %d %s\n",result,retVal, path[0]);
		} catch (Exception e) {
			Logger.logException("parseProcesInstance", e.getMessage());	
		}
		return WsResponse.create();
	}
	
	private static HandlingIndicator handleErrorIndicator(String method, String id, HandlingIndicator handlingIndicator)
			throws WsException {

		switch (handlingIndicator) {
		case Ok:
			Logger.logInvoke(method, id);
			break;
		case Error:
			Logger.logError(method, id);
			throw new WsException(new WsFault("1", "Functional error " + method));
		case Exception:
		case Unknown:
		default:
			Logger.logException(method, id);
			throw new WsException(new WsFault("0", "Technical error " + method));
		}

		return handlingIndicator;
	}

}
