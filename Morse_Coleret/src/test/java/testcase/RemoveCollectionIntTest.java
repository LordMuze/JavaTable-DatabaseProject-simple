package testcase;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;
import testcode.*;


@RunWith(Parameterized.class)
public class RemoveCollectionIntTest {
	private int collectionIndex;
	private boolean expectedResult;
	private Collection_Abstract handler;
	
	@Before
	public void setUp(){
		handler = new Collection_Operation();
	}

	public RemoveCollectionIntTest(int collectionIndex, boolean expectedResult) {
		this.collectionIndex = collectionIndex;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection<Object[]> listOfRemoval(){
		return Arrays.asList(new Object[][] {
			{0, true},
			{20, false},
			{7, true},
			{2, true}
		});
	}
	@Test
	public void test() {
		Assert.assertEquals(expectedResult, handler.removeCollection(collectionIndex));
	}

}
