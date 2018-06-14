package data;

public class Name {
	//this class will be dynamic as there might be sub components
	//such as surnames and formalities included
	private String name;
	private boolean status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
