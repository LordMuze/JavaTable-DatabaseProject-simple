package testcode;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public class StringIterableArray extends IterableToArrayList {
	private ArrayList<Document> arrayData = getDataArray();
	public StringIterableArray(FindIterable<Document> data) {
		super(data);
	}
	@Override
	public ArrayList<Object> getData() {
		ArrayList<Object> arrayList = new ArrayList<Object>();
		for(int i = 0; i < arrayData.size(); i++) {
			arrayList.add(i, arrayData.get(i).getString("name"));
		}
		return arrayList;
	}
	
}
