package main;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import Query_Operation.*;
import collection_manage.Collection_Abstract;
import data.DefaultConverter;
import data.Driving_Conversion_Interface;
import data.Fxconverter;
import data.Person;
import javafx.collections.ObservableList;
public class DB_Query {
	static int i = 0;
	private Collection_Abstract collectionManager;
	private Driving_Conversion_Interface dataConverter;
    public DB_Query(Collection_Abstract collectionManager) {
    	this.collectionManager = collectionManager;
    	dataConverter = new DefaultConverter();
    }
	
	public List<List<Object>> find(Bson filter) {
		i++;
		return dataConverter.convertGetData(new FindExecutable(collectionManager.getCollection(2)).queryGetData(filter));
	}
    public List<List<Object>> find() {
    	i++;
    	System.out.println("Testing DBQUERY");
    	return dataConverter.convertGetData(new FindExecutable(collectionManager.getCollection(2)).queryGetData());
	}
    
    public void insert(Document doc) {
    	new InsertExecutable(collectionManager.getCollection(2)).insert(doc);
    }
    
    public void setDataType(String dataType) {
    	if(dataType == "default") {
    		dataConverter = new DefaultConverter();
    	}
    	if(dataType == "fx") {
    		dataConverter = new Fxconverter();
    	}
    }
    
    
    
	public List<Object> getColumnNamesData(){
		if(i == 1) {
	    i = 0;
		return dataConverter.getArrayColumn();
		}
		return null;
	}
	
	public ObservableList<Person> getPersonDataList(){
		i++;
		return dataConverter.convertGetPersonData(new FindExecutable(collectionManager.getCollection(2)).queryGetData());
	}
	
}
