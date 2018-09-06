package guitable;

import java.util.List;

import org.bson.Document;

import data.Person;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import main.DB_Query;

public class ButtonAddData extends Button {
	private List<TextField> textFieldArray;
	private String temp;
	private DB_Query dbQuery;
	private Person person;
	public ButtonAddData(DB_Query dbQuery, ObservableList<Person> obsList) {
		super("Add");
		this.dbQuery = dbQuery;
		this.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    person = new Person();
		    for(int i = 0; i < textFieldArray.size(); i++) {
		    	temp = textFieldArray.get(i).getText();
		    	person.put(textFieldArray.get(i).getPromptText(), temp);
		    	person.setName(temp);
		    	textFieldArray.get(i).clear();
		    }
		    addDocument(person);	
		    obsList.add(person);
		    }
		});
		
	}
	public void addTextFieldArray(List<TextField> textFieldArray) {
		this.textFieldArray = textFieldArray;
	}
	private void addDocument(Person person) {
		Document doc;
		doc = person;
		dbQuery.insert(doc);
	}
}
