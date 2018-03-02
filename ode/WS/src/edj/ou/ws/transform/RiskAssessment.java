package edj.ou.ws.transform;

public class RiskAssessment {
	
	public String check(String clientId, String amount) {
		String[] clients = {"low", "medium", "high", "unknown"};
		int idx = Integer.valueOf(clientId).intValue();
		System.out.printf("invoke RiskAssessment.check(%s,%s) : %s\n",clientId, amount, clients[idx] );
		return clients[idx];
	}
}
