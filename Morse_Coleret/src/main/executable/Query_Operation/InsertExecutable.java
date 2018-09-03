package Query_Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

public class InsertExecutable {
	private MongoCollection<Document> collection;
	private List<Document> arrayDocument = new ArrayList<Document>();
	public void insert() {
		collection.insertMany(arrayDocument);
	}
	//bulk write operations here
	public void setCollection(MongoCollection<Document> collection) {
		this.collection = collection;
	}
	//array as list here
	public void setData(Document[] documentArray) {
		arrayDocument = Arrays.asList(documentArray);
	}
}
