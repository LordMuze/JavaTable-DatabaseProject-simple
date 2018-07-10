package testcode;

import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public class DefaultConverter implements Driving_Conversion_Interface {
	private Document document;
	private List<List<Object>> listData;
	public List<List<Object>> convertGetData(FindIterable<Document> iterable) {
		int counter = 0;
		Iterator<Document> iterate = iterable.iterator();
		//follows according to the documentation
		//name, boolean, description
		while(iterate.hasNext()) {
			document = (Document) iterate.next();
			listData.get(counter).add(document.getString("name"));
			listData.get(counter).add(document.getBoolean("State"));
			listData.get(counter).add(document.getString("Desc"));
			counter++;
		}
		return listData;
	}

}
