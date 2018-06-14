package data;

public class DatabaseObject {
	private Name name;
	public DatabaseObject(Name name) {
		this.name = name;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
}
