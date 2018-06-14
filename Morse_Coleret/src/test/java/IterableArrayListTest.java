import static org.junit.Assert.*;

import org.bson.Document;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mongodb.*;
import com.mongodb.client.FindIterable;

import java.util.*;
public class IterableArrayListTest {
	private FindIterable<Document> mongoIterable;
	private Test_Setup setup;
	@BeforeClass
	public void startConnectingDb() {
		setup = new Test_Setup();
	}
	@Before
	public void getIterableFromCollection() {
		mongoIterable = setup.getDoc();
	}
	@Test
	public void test() {
		Iterator<Document> iterateMongo = mongoIterable.iterator();
		while(iterateMongo.hasNext()) {
			
		}
	}

}
