import java.util.Iterator;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.Test;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Test_Setup {
	private FindIterable<Document> doc;
	private class MongoClientInstantiate {
		private MongoClient client;
		public MongoClient getMongoInstance(MongoClientURI connection) {
			if(client == null) {
				client = new MongoClient(connection);
			}
			return client;
		}
	}

	@Test
	public void test() {
		 MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
		 MongoClient mongoClient = new MongoClientInstantiate().getMongoInstance(connectionString);
		 MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
		 System.out.println("Assuming that the collection has been created, ");
		 System.out.println("Then begin insertion of documents! ");
		 Document document = new Document();
		 document.put("name", "Serbesius");
		 Bson filterDocking = (Bson) document;
		 MongoCollection<Document> theCollection = mongoDatabase.getCollection("TestCollection");
		 theCollection.insertOne(document);
		 System.out.println("Data inserted!");
		 Bson filterDoc = (Bson) document;
		 doc = theCollection.find(filterDoc);
		 Iterator<Document> iterate = doc.iterator();
		 /*
		 while(iterate.hasNext()) {
			 document = (Document) iterate.next();
			 System.out.println("Name: "+  document.getString("name"));
			 document.put("Registration:", "Alpha");
			 Document newDocument = new Document("$set", document);
			 theCollection.updateOne(filterDocking, newDocument);
			 System.out.println("Registration inserted!");
		 }
		 */
		 System.out.println("Ends!");
	} // unit testing on whether the library is working

	public FindIterable<Document> getDoc() {
		return doc;
	}//results for next test
}
