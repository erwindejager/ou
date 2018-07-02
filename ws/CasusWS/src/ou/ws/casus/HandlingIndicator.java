package ou.ws.casus;

public enum HandlingIndicator {
	
	Ok("Ok"), 
	Error("Error"), 
	Exception("Exception"),
	Unknown("Uknown");

	private String value;  
	
	HandlingIndicator(String handlingIndicator) {
		this.setValue(handlingIndicator);
	}

	public boolean compare(HandlingIndicator handlingIndicator) {
		return (this.compareTo(handlingIndicator) == 0);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	static public HandlingIndicator getEnum(String indicatorString) {
		for (HandlingIndicator handlingIndicator : HandlingIndicator.values()) {
			if (indicatorString.equals(handlingIndicator.name())) {
				return handlingIndicator;
			}
		}
		return HandlingIndicator.Unknown;
	}

}