package databasetest;

import static org.junit.Assert.*;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.UpdateResult;

import testcode.Collection_Abstract;
import testcode.Collection_Operation;
import testcode.Mongo_Singleton;
import testcode.No_1_Update_Operation;

public class Update_Operation_One {
	private No_1_Update_Operation operand;
	
	private Mongo_Singleton singleton;
    private Collection_Abstract collectionOp;
    private MongoCollection<Document> collection;
    
    private Bson filter, update, updateForOp;
    private UpdateResult result;
	@Before
	public void setUp() throws Exception {
		singleton = new Mongo_Singleton();
		singleton.mongoURI();
		collectionOp = new Collection_Operation(singleton);
		collection = collectionOp.getCollection("TestCollection");
		operand = new No_1_Update_Operation();
		operand.setCollection(collection);
		Document doc = new Document();
		doc.put("name", "Serbesius");
		filter = (Bson) doc;
		Document dc = new Document();
		dc.put("name", "Nikola");
		update = (Bson) dc;
		updateForOp = new Document("$set", dc);
	}

	@Test
	public void testUpdate() {
		result = operand.update(filter, updateForOp);
		Assert.assertTrue(result.getModifiedCount() > 0);
	}

}
