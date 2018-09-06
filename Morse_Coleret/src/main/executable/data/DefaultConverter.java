package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;

import javafx.collections.ObservableList;

public class DefaultConverter implements Driving_Conversion_Interface {
	private Document document;
	public List<List<Object>> convertGetData(FindIterable<Document> iterable) {
		int counter = 0;
		Iterator<Document> iterate = iterable.iterator();
	     getColumnData((Document) iterate.next());
		 while(iterate.hasNext()) {
			document = (Document) iterate.next();
			for(int i = 0; i < columnData.size(); i++) { 
			    listData.add(new ArrayList<Object>());
				listData.get(counter).add(document.getString(columnData.get(i).toString()));
			}
			counter++;
		}
		return listData;
	}
	@Override
	public List<Object> getArrayColumn() {
		return columnData;
	}
	@Override
	public ObservableList<Person> convertGetPersonData(FindIterable<Document> iterable) {
		System.out.println("Default converter does not implement!");
		return null;
	}
}
