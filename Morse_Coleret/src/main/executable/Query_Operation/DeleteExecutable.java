package Query_Operation;

import org.bson.Document;

import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;

public class DeleteExecutable extends ExecutableAbstract {
	public DeleteExecutable(MongoCollection<Document> collection) {
		super(collection);
	}
	public void setCollection(MongoCollection<Document> collection) {
		this.collection = collection;
	}

	public DeleteResult delete(Bson filter) {
		return collection.deleteMany(filter);
	}
}
