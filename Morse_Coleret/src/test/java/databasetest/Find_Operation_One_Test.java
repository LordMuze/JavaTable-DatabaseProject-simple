package databasetest;

import static org.junit.Assert.*;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.client.MongoCollection;

import databasetestStubs.DataConvertStubs;
import testcode.*;
public class Find_Operation_One_Test {
	private Mongo_Singleton singleton;
    private Collection_Abstract collectionOp;
    private MongoCollection<Document> collection;
    private No_1_Find_Operation findOperation;
    private DataConvertStubs stub = new DataConvertStubs();
    private Bson filter;
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		singleton = new Mongo_Singleton();
		singleton.mongoURI();
		collectionOp = new Collection_Operation(singleton);
		collection = collectionOp.getCollection("TestCollection");
		findOperation = new No_1_Find_Operation();
		findOperation.setCollection(collection);
		Document doc = new Document();
		doc.put("name", "Serbesius");
		filter = (Bson) doc;
	}

	@Test
	public void test() {
		stub.setDocumentIterable(findOperation.queryGetData(filter));
		stub.testResult();
	}

}
