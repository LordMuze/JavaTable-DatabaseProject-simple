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

import testcode.Collection_Abstract;
import testcode.Collection_Operation;
import testcode.IterableToArrayList;
import testcode.Mongo_Singleton;
import testcode.No_1_Find_Operation;


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
	@Before
	public void setUp() throws Exception {
		singleton = new Mongo_Singleton();
		singleton.mongoURI();
		collectionOp = new Collection_Operation(singleton);
		collection = collectionOp.getCollection("TestCollection");
		findOperation = new No_1_Find_Operation();
		dataConverter = new IterableToArrayList();
		findOperation.setCollection(collection);
		iterable = findOperation.queryGetData();
		dataConverter.setData(iterable);
	}

	@Test
	public void test() {
		ArrayList arrayResult = dataConverter.getDataArray();
		Document[] actualResult = (Document[]) arrayResult.toArray(new Document[arrayResult.size()]);
	}

}
