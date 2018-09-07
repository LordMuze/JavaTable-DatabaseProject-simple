package guitable;

import data.Person;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import main.DB_Query;

public class ButtonRemove extends Button {
	public ButtonRemove(DB_Query dbQuery, ObservableList<Person> obsList) {
		super("Remove");
		//this.dbQuery = dbQuery;
		this.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    
		    }
		    
		    
		});
	}
}
