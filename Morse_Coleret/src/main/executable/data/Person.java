package data;




import org.bson.Document;

import javafx.beans.property.SimpleStringProperty;

public class Person extends Document {
	private SimpleStringProperty firstName;
	private String temp;
    public Person() {
    	
    }
    public Person(String name) {
    	firstName = new SimpleStringProperty(name);
    }
    public String getName() {
        return firstName.get();
    }
    public void setName(String name) {
    	firstName = new SimpleStringProperty(name);
    }
    public void setName(SimpleStringProperty name) {
    	this.firstName = name;
    }
    
    //for testing
    public void addDocumentName() {
    	if(!temp.isEmpty()) {
    		temp = firstName.get();
    		this.put("name", temp);
    	}
    }
    
}

