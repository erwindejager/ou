package edj.ou.ws.transform;

public class Increment {
	
	public String incr(String i) {
		System.out.printf("invoke Increment.incr(%s)\n",i);
		return String.valueOf(Integer.valueOf(i).intValue() + 1);
	}
	
}
