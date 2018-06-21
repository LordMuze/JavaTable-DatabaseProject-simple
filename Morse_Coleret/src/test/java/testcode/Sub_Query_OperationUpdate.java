package testcode;
import org.bson.conversions.Bson;

import com.mongodb.client.result.UpdateResult;
public interface Sub_Query_OperationUpdate extends Query_Operations_Interface {
	public UpdateResult update(Bson filter, Bson update);
}
