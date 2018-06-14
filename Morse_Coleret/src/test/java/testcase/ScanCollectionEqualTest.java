package testcase;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;
import testcode.*;

@RunWith(Parameterized.class)
public class ScanCollectionEqualTest {
	Collection_Abstract colOperation = new Collection_Operation();
	String[] testCollection = {"Alpha", "Beta", "Zeta", "Omega", "Fera",
			"Lise", "Dorshe", "Anglame"};
	private int collectionIndex;
	private boolean expectedResult;
	public ScanCollectionEqualTest(int collectionIndex, boolean expectedResult) {
		this.collectionIndex = collectionIndex;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection collectionData() {
		return Arrays.asList(new Object[][] {
			{0, false},
			{1, false},
			{2, false},
			{3, true},
			{4, true}
		});
	}
	@Test
	public void test() {
		Assert.assertEquals(expectedResult, 
				colOperation.scanCollectionSameName(testCollection[collectionIndex]));
	}

}
