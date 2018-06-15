package testcode;

import org.bson.Document;
import com.mongodb.client.MongoCollection;

import databasetestStubs.TestStubInterface;

public interface Query_Operations_Interface extends TestStubInterface {
	//other parameters not supported
	public void setCollection(MongoCollection<Document> collection);
}
