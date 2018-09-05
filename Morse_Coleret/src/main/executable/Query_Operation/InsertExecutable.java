package Query_Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

public class InsertExecutable {
	private MongoCollection<Document> collection;
	public InsertExecutable(MongoCollection<Document> collection) {
		this.collection = collection;
	}
	private List<Document> arrayDocument = new ArrayList<Document>();
	public void insert(Document[] documentArray) {
		arrayDocument = Arrays.asList(documentArray);
		collection.insertMany(arrayDocument);
	}

	public void setCollection(MongoCollection<Document> collection) {
		this.collection = collection;
	}
	
}
