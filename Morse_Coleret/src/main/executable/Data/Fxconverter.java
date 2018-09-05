package Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Fxconverter implements Driving_Conversion_Interface {

	private Document document;
	private SimpleStringProperty tempStringProp;
	//private Person tempPerson;
	public ObservableList<Person> convertGetPersonData(FindIterable<Document> iterable){
		//ObservableList<Person> data = FXCollections.observableArrayList();
		PersonHelperConverterClass helper = new PersonHelperConverterClass();
		int counter = 0;
		Iterator<Document> iterate = iterable.iterator();
	    getColumnData((Document) iterate.next());
		 while(iterate.hasNext()) {
			document = (Document) iterate.next();
			for(int i = 0; i < columnData.size(); i++) {
				//tempPerson = new Person();
				tempStringProp = new SimpleStringProperty(document.getString(columnData.get(i).toString()));
				helper.setFirstNamePerson(tempStringProp);
				//tempPerson.setFirstName(tempStringProp);
				//data.add(tempPerson);
			    //listData.add(new ArrayList<Object>());
				//listData.get(counter).add(document.getString(columnData.get(i).toString()));
			}
			
			counter++;
		}
		return helper.returnData();
	}
	public List<List<Object>> convertGetData(FindIterable<Document> iterable) {
		System.out.println("Fx Converter!");
		return null;
	}
	@Override
	public List<Object> getArrayColumn() {
		return columnData;
	}
	
	
	
	class PersonHelperConverterClass {
		ObservableList<Person> data = FXCollections.observableArrayList();
		Person personNew;
		public void setFirstNamePerson(SimpleStringProperty prop) {
			personNew = new Person();
			personNew.setFirstName(prop);
			data.add(personNew);
		}
		public ObservableList<Person> returnData(){
			
			return data;
		}
	}
	

}
