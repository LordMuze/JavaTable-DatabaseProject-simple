package Query_Operation;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

public class FindExecutable extends ExecutableAbstract {
	public FindExecutable(MongoCollection<Document> collection) {
		super(collection);
	}
	public FindIterable<Document> queryGetData(Bson filter) {
		return collection.find(filter);
	}
	public FindIterable<Document> queryGetData(){
		return collection.find();
	}
}
