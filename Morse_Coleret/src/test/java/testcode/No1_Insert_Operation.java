package testcode;


import org.bson.Document;

import com.mongodb.client.MongoCollection;

public class No1_Insert_Operation implements Sub_Query_OperationInsert {
	private MongoCollection collection;
	public void insert() {
		
	}
	//bulk write operations here
	public void setCollection(MongoCollection<Document> collection) {
		this.collection = collection;
	}

}
