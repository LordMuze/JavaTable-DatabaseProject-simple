package testcode;

import org.bson.conversions.Bson;

import com.mongodb.client.result.DeleteResult;

public interface Sub_Query_Operation_Delete extends Query_Operations_Interface {
	public DeleteResult delete(Bson filter);
}
