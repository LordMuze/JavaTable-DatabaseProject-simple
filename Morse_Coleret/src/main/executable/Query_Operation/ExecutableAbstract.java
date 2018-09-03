package Query_Operation;

import org.bson.Document;

import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;

public abstract class ExecutableAbstract {
	protected MongoCollection<Document> collection;
	public ExecutableAbstract(MongoCollection<Document> collection) {
		this.collection = collection;
	}
}
