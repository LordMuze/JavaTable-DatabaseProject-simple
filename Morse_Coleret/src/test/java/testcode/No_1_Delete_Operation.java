package testcode;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;

public class No_1_Delete_Operation implements Sub_Query_Operation_Delete {
	MongoCollection collection;
	public void setCollection(MongoCollection<Document> collection) {
		this.collection = collection;
	}

	public void setData(Document[] documentArray) {
		// TODO Auto-generated method stub

	}

	public DeleteResult delete(Bson filter) {
		// TODO Auto-generated method stub
		return collection.deleteMany(filter);
	}

}
