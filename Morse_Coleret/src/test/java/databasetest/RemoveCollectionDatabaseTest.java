package databasetest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.client.MongoDatabase;

import testcode.Collection_Abstract;
import testcode.Collection_Operation;
import testcode.Mongo_Singleton;

public class RemoveCollectionDatabaseTest {
	private Mongo_Singleton singleton;
    private Collection_Abstract collectionOp;
    private MongoDatabase db;
	@Before
	public void setUp() throws Exception {
		singleton = new Mongo_Singleton();
		singleton.mongoURI();
		collectionOp = new Collection_Operation(singleton);
	}
	@Test
	public void test() {
		Assert.assertTrue(collectionOp.removeCollection("Testing"));
	}

}
