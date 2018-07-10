package testcode;

import org.bson.conversions.Bson;

import com.mongodb.client.result.DeleteResult;

public interface Sub_Query_Operation_Delete extends Query_Operations {
	public DeleteResult delete(Bson filter);
}
