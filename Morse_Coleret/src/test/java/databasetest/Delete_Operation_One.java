package databasetest;

import static org.junit.Assert.*;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.client.MongoCollection;

import testcode.*;

public class Delete_Operation_One {
	private Mongo_Singleton singleton;
    private Collection_Abstract collectionOp;
    private MongoCollection<Document> collection;
    private No_1_Delete_Operation operation;
    private Bson filter;
	@Before
	public void setUp() throws Exception {
		singleton = new Mongo_Singleton();
		singleton.mongoURI();
		collectionOp = new Collection_Operation(singleton);
		collection = collectionOp.getCollection("TestCollection");
		operation = new No_1_Delete_Operation();
		operation.setCollection(collection);
		filter = new Document("name", "Nikola");
	}

	@Test
	public void testDelete() {
		Assert.assertTrue(operation.delete(filter).getDeletedCount() > 0);
	}

}
