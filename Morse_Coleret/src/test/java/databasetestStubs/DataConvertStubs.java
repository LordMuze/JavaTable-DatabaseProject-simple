package databasetestStubs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public class DataConvertStubs {
	
	private List<Document> documentList = new ArrayList<Document>();
	
	FindIterable<Document> documentIterable;
	private Document document;
	public void setDocumentIterable(FindIterable<Document> documentIterable) {
		this.documentIterable = documentIterable;
	}
	public void testResult() {
		Iterator<Document> iterate = documentIterable.iterator();
		while(iterate.hasNext()) {
			document = (Document) iterate.next();
			System.out.println("Namae wa?: " + document.getString("name"));
			documentList.add(document);
			//break;
		}
	}
	public void getKeys() {
		Set<String> keysDoc = document.keySet();
		Object[] obj = keysDoc.toArray();
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].toString());
		}
		System.out.println(keysDoc);
	}
	public void getListKeys() {
		Map<String, Document> docList = (Map) documentList;
		Set<String> keysDoc = docList.keySet();
		for(String key: docList.keySet()) {
			System.out.println("Keys: " + key);
		}
	}
}
