package testcode;

import org.bson.Document;
import com.mongodb.client.MongoCollection;

import databasetestStubs.TestStubInterface;

public interface Query_Operations {
	public void setCollection(MongoCollection<Document> collection);
}
