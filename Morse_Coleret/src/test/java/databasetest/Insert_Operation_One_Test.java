package databasetest;


import org.bson.Document;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.client.MongoCollection;
import testcode.*;

public class Insert_Operation_One_Test {
	private Mongo_Singleton singleton;
    private Collection_Abstract collectionOp;
    private MongoCollection<Document> collection;
    private Sub_Query_OperationInsert insertClass = new No1_Insert_Operation();
	@Before
	public void setUp() throws Exception {
		singleton = new Mongo_Singleton();
		singleton.mongoURI();
		collectionOp = new Collection_Operation(singleton);
		collection = collectionOp.getCollection("TestCollection");
		insertClass.setCollection(collection);
		//insertClass.setData();
	}

	@Test
	public void testInsert() {
		insertClass.insert();
	}

}

final class DataDocumentTest {
	Document docOne = new Document();
}
