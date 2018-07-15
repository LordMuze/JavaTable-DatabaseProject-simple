package testcode;

import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public class DefaultConverter implements Driving_Conversion_Interface {
	private Document document;
	//private List<List<Object>> listData;
	public List<List<Object>> convertGetData(FindIterable<Document> iterable) {
		int counter = 0;
		Iterator<Document> iterate = iterable.iterator();
		//follows according to the documentation
		//name, boolean, description
	     getColumnData((Document) iterate.next());
		 while(iterate.hasNext()) {
			document = (Document) iterate.next();
			for(int i = 0; i < listData.size(); i++) {
				listData.get(counter).add(document.getString(listData.get(i)));
			}
			counter++;
		}
		return listData;
	}
	@Override
	public List<Object> getArrayColumn() {
		// TODO Auto-generated method stub
		return columnData;
	}
}
