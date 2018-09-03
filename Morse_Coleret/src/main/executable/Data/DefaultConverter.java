package Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public class DefaultConverter implements Driving_Conversion_Interface {
	private Document document;
	public List<List<Object>> convertGetData(FindIterable<Document> iterable) {
		int counter = 0;
		Iterator<Document> iterate = iterable.iterator();
	     getColumnData((Document) iterate.next());
		 while(iterate.hasNext()) {
			document = (Document) iterate.next();
			for(int i = 1; i < columnData.size(); i++) { //i is one since i = 0 is an inconvertible ObjectId
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
}
