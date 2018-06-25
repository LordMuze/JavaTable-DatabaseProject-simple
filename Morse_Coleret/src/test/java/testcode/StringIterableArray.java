package testcode;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public class StringIterableArray extends IterableToArrayList {
	private ArrayList<Document> arrayData = getDataArray();
	public StringIterableArray(FindIterable<Document> data) {
		super(data);
	}
	public Object[] arrayListStringArray() {
		Object[] objectArray = new Object[arrayData.size()];
		for(int i = 0; i < arrayData.size(); i++) {
			objectArray[i] = arrayData.get(i).getString("name");
		}
		return objectArray;
	} 
	@Override
	public Object[] getData() {
		// TODO Auto-generated method stub
		return arrayListStringArray();
	}
	
}
