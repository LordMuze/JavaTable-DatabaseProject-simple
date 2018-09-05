package Data;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;

import javafx.collections.ObservableList;

public interface Driving_Conversion_Interface {
	public List<List<Object>> convertGetData(FindIterable<Document> iterable);
	public ObservableList<Person> convertGetPersonData(FindIterable<Document> iterable);
	static final List<List<Object>> listData = new ArrayList<List<Object>>();
	static final List<Object> columnData = new ArrayList<Object>();
	public List<Object> getArrayColumn();
	default List<Object> getColumnData(Document doc) {
		int counter = 0;
		for(String key: doc.keySet()) {
			if(counter > 0) {
		    System.out.println("Happens only once!" + " counter: " + counter);
			columnData.add(key);
			}
			counter++;
		}
		counter = 0;
		//counter assigned since counter = 0 is an inconvertible ObjectId or "_id"
		return columnData;
	}
	static void refreshData() {
		listData.clear();
		columnData.clear();
	}
}
