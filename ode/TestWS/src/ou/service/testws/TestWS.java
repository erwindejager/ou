package ou.service.testws;

public class TestWS {

	public String incValue(String i) {
		System.out.printf("invoke TestWS.incValue(%s)",i);
		return String.valueOf(Integer.valueOf(i).intValue() + 1);
	}
	
}
