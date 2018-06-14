package testcode;


import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.mongodb.client.MongoCollection;

public class No1_Insert_Operation implements Sub_Query_OperationInsert {
	private MongoCollection<Document> collection;
	List<Document> arrayDocument = new ArrayList<Document>();
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
