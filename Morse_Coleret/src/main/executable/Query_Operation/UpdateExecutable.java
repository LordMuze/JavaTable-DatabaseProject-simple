package Query_Operation;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;

public class UpdateExecutable {
	private MongoCollection<Document> collection;
	public UpdateExecutable(MongoCollection<Document> collection) {
		this.collection = collection;
	}
	public void setCollection(MongoCollection<Document> collection) {
		this.collection = collection;
	}
	public UpdateResult update(Bson filter, Bson update) {
		UpdateOptions updateOptions = new UpdateOptions();
		updateOptions.upsert(true);
		return collection.updateOne(filter, update, updateOptions);
	}
	
}
