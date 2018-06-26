package collectiontest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.bson.Document;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import testcode.*;
import databasetestStubs.IterableToArrayListStringNameStub;

//Test parameters with, one from the parameterized list and other from db
//Using find operation stubs for the test
public class FindIterableToArrayListTest {
	private Mongo_Singleton singleton;
    private Collection_Abstract collectionOp;
    private MongoCollection<Document> collection;
    private No_1_Find_Operation findOperation;
	private IterableToArrayList dataConverter;
	private FindIterable iterable;
	private String[] expectedResult = {"Serbesius", "Asterisk", "Grazing", "ENFJ", "ENFP"};
	private IterableToArrayList itera;
	@Before
	public void setUp() throws Exception {
		singleton = new Mongo_Singleton();
		singleton.mongoURI();
		collectionOp = new Collection_Operation(singleton);
		collection = collectionOp.getCollection("TestCollection");
		findOperation = new No_1_Find_Operation();
		findOperation.setCollection(collection);
		iterable = findOperation.queryGetData();
		dataConverter = new StringIterableArray(iterable);
		itera = new StringIterableArray(iterable);

	}

	@Test
	public void test() {
		//ArrayList arrayResult = dataConverter.getDataArray();
		//Document[] actualResult = (Document[]) arrayResult.toArray(new Document[arrayResult.size()]);
	    ArrayList<Object> objectArray = itera.getData();
	    for(int i = 0; i < objectArray.size(); i++) {
	    	System.out.println(objectArray.get(i).toString());
	    }
	}

}
