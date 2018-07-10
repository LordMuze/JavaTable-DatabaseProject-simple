package testcode;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;

public interface Sub_Query_OperationFind extends Query_Operations {
	public  FindIterable<Document> queryGetData(Bson filter);
	public  FindIterable<Document> queryGetData();
}
