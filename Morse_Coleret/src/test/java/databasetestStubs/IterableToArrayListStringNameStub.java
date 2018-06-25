package databasetestStubs;

import org.bson.Document;
import testcode.*;
public class IterableToArrayListStringNameStub {
	public void arrayListStringArray(Document[] documentArray) {
		for(int i = 0; i < documentArray.length; i++) {
			System.out.println(documentArray[i].getString("name"));
		}
	}
	
}
