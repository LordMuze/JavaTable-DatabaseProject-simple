package testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import testcode.*;

public class MongoURITest {
	static Mongo_Singleton singleton;
	@BeforeClass
	public static void setUp() {
		singleton = new Mongo_Singleton();
	}
	@Test
	public void testMongoURI() {
		singleton.mongoURI();
	}

}
