package main;
import java.util.List;


import org.bson.conversions.Bson;

import Data.DefaultConverter;
import Data.Driving_Conversion_Interface;
import Query_Operation.*;
import collection_manage.Collection_Abstract;
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
    public void setDataType(String dataType) {
    	System.out.println("No variations implemented yet!");
    }
	public List<Object> getColumnNamesData(){
		if(i == 1) {
	    i = 0;
		return dataConverter.getArrayColumn();
		}
		return null;
	}
	
}
