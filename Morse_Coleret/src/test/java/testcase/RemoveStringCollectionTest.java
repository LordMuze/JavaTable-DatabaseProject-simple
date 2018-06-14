package testcase;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import testcode.*;

@RunWith(Parameterized.class)
public class RemoveStringCollectionTest {
	private String collectionName;
	private boolean expectedResult;
	private Collection_Abstract handler;
	
	public RemoveStringCollectionTest(String collectionName, boolean expectedResult) {
		this.collectionName = collectionName;
		this.expectedResult = expectedResult;
	}
	@Before
	public void setUp() {
		handler = new Collection_Operation();
	}
	@Parameterized.Parameters
	public static Collection<Object[]> listOfRemoval() {
		return Arrays.asList(new Object[][] {
			{"Lirque", true},
			{"Thomas", false},
			{"Anglame", true},
			{"Desh", true},
			{"", false}
		});
	}
	@Test
	public void test() {
		Assert.assertEquals(expectedResult, handler.removeCollection(collectionName));
	}

}
