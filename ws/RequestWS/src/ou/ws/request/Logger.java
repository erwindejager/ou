package ou.ws.request;

public class Logger {
	
	public static void logError(String method, String id) 	{
		log("Error", method, id);
	}

	public static void logException(String method, String id) 	{
		log("Exception", method, id);
	}

	public static void logInvoke(String method, String id) 	{
		log("Invoke", method, id);
	}
	
	static private void log(String prefix, String method, String id) {
		System.out.printf("%s %s(%s)\n", prefix,  method, id);		
	}

}
