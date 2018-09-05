package Data;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleStringProperty;

public class Person {
	private SimpleStringProperty firstName;
    
    public String getName() {
        return firstName.get();
    }
    public void setFirstName(String name) {
    	firstName = new SimpleStringProperty(name);
    }
    public void setFirstName(SimpleStringProperty name) {
    	this.firstName = name;
    }
    
}

