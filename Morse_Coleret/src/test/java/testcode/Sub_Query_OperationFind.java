package testcode;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;

public interface Sub_Query_OperationFind extends Query_Operations_Interface {
	public  FindIterable<Document> queryGetData(Bson filter);
}
