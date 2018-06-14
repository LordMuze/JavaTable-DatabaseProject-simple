package testcode;

import org.bson.Document;
import com.mongodb.client.MongoCollection;

public interface Query_Operations_Interface {
	//other parameters not supported
	public void setCollection(MongoCollection<Document> collection);
}
