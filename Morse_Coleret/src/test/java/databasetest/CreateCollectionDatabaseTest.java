package databasetest;

import static org.junit.Assert.*;
import testcode.*;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.client.MongoDatabase;

import junit.framework.Assert;

public class CreateCollectionDatabaseTest {
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
		collectionOp.addCollectionDB("Testing");
		Assert.assertEquals("Testing", collectionOp.getCollection("Testing"));
	}

}
