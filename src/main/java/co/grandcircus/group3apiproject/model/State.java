package co.grandcircus.group3apiproject.model;

public class State {

	private String name;
	private String stateCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	@Override
	public String toString() {
		return "State [name=" + name + ", stateCode=" + stateCode + "]";
	}
	
	
}
