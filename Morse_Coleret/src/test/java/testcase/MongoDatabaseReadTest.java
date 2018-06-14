package testcase;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import testcode.Mongo_Singleton;
@RunWith(Parameterized.class)
public class MongoDatabaseReadTest {
	private int databaseNumber;
	public MongoDatabaseReadTest(int databaseNumber) {
		this.databaseNumber = databaseNumber;
	}
	private static Mongo_Singleton singleton = new Mongo_Singleton();	
	@BeforeClass
	public static void setUp() {
		singleton.mongoURI();
	}
	@Test
	public void test() {
		singleton.getSetDatabase(databaseNumber);
	}
	@Parameterized.Parameters
	public static Collection databases() {
		return Arrays.asList(new Object[] {
			    0,
			    1,
			    2
		});
	}
	

}
