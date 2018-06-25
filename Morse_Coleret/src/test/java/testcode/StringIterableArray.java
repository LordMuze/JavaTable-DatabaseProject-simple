package testcode;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public class StringIterableArray extends IterableToArrayList {
	public StringIterableArray(FindIterable<Document> data) {
		super(data);
	}
	public void arrayListStringArray(Document[] documentArray) {
		for(int i = 0; i < documentArray.length; i++) {
			System.out.println(documentArray[i].getString("name"));
		}
	}
	@Override
	public ArrayList getDataArray() {
		// TODO Auto-generated method stub
		return null;
	}
}
