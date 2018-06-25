package testcode;
import java.util.*;

import org.bson.Document;

import com.mongodb.client.FindIterable;
@SuppressWarnings("rawtypes")
public abstract class IterableToArrayList {
	public IterableToArrayList(FindIterable<Document> data) {
		this.data = data;
	}
	private int i = 0;
	private FindIterable<Document> data;
	private ArrayList<Document> dataArray = new ArrayList<Document>();
	public void setData(FindIterable<Document> data) {
		this.data = data;
	}
	public abstract Array 
	public ArrayList getDataArray() {
		Iterator<Document> iterate = data.iterator();
		while(iterate.hasNext()) {
			dataArray.add(i, (Document) iterate.next());
			i++;
		}
		return dataArray;
	}
}
