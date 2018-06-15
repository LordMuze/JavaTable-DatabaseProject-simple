package databasetest;


import org.bson.Document;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.client.MongoCollection;

import databasetestStubs.InsertStubs;
import testcode.*;

public class Insert_Operation_One_Test {
	private Mongo_Singleton singleton;
    private Collection_Abstract collectionOp;
    private MongoCollection<Document> collection;
    private Sub_Query_OperationInsert insertClass = new No1_Insert_Operation();
    
    //
    private InsertStubs stub;
    //
	@Before
	public void setUp() throws Exception {
		singleton = new Mongo_Singleton();
		singleton.mongoURI();
		collectionOp = new Collection_Operation(singleton);
		collection = collectionOp.getCollection("TestCollection");
		insertClass.setCollection(collection);
		stub = new InsertStubs();
		stub.insertingData();
		insertClass.setData(stub.getDocumentArray());
	}

	@Test
	public void testInsert() {
		insertClass.insert();
		System.out.println("Operation insert done!");
	}
}

