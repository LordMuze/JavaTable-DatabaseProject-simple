package testcode;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.UpdateResult;

public class No_1_Update_Operation implements Sub_Query_OperationUpdate {
	private MongoCollection collection;
	public void setCollection(MongoCollection<Document> collection) {
		// TODO Auto-generated method stub
		this.collection = collection;
	}

	public void setData(Document[] documentArray) {
		// TODO Auto-generated method stub

	}

	public UpdateResult update(Bson filter, Bson update) {
		return collection.updateMany(filter, update);
	}
}
