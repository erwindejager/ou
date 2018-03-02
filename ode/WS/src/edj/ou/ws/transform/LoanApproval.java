package edj.ou.ws.transform;

public class LoanApproval {
	
	public String check(String clientId, String amount) {
		String[] approvals = {"approved", "approved", "rejected", "rejected"};
		int idx = Integer.valueOf(clientId).intValue();
		System.out.printf("invoke LoanApproval.check(%s,%s) : %s\n",clientId, amount, approvals[idx] );
		return approvals[idx];
	}
}
