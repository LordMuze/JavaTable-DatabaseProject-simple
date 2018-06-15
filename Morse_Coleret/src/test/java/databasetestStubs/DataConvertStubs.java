package databasetestStubs;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public class DataConvertStubs {
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
		}
	}
}
