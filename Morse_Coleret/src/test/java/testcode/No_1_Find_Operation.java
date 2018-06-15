package testcode;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

public class No_1_Find_Operation implements Sub_Query_OperationFind {
	MongoCollection<Document> collection;
	public void setCollection(MongoCollection<Document> collection) {
		// TODO Auto-generated method stub
		this.collection = collection;
	}

	public void setData(Document[] documentArray) {
		// TODO Auto-generated method stub
	}

	public FindIterable<Document> queryGetData(Bson filter) {
		// TODO Auto-generated method stub
		return collection.find(filter);
	}
	public FindIterable<Document> queryGetData(){
		return collection.find();
	}

}
