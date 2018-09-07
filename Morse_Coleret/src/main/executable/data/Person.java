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
    	addDocumentName();
    }
    public String getName() {
    	addDocumentName();
        return firstName.get();
    }
    public void setName(String name) {
    	firstName = new SimpleStringProperty(name);
    	this.temp = name;
    	addDocumentName();
    }
    public void setName(SimpleStringProperty name) {
    	this.firstName = name;
    	temp = this.firstName.get();
    	addDocumentName();
    }
    
    //for testing
    public void addDocumentName() {
    	if(!temp.isEmpty()) {
    		temp = firstName.get();
    		this.put("name", temp);
    	}
    }
    
}

