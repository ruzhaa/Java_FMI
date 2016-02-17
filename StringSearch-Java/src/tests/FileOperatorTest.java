package tests;

import static org.junit.Assert.*;
import org.junit.*;

import my.implementation.FileHolder;
import my.implementation.FileOperator;

public class FileOperatorTest {

	private String key;
	private FileHolder testFileOperatorHolder;
	private FileOperator testFileOperator;

	@Before
	public void initalize() {
		key = "blq";
		testFileOperatorHolder = new FileHolder();
		testFileOperator = new FileOperator(testFileOperatorHolder);
	}

	@Test
	public void testIsVisited() {

		testFileOperator.tryVisitFile(key);
		Boolean expectedValue = true;
		Boolean actualValue = testFileOperator.isVisited(key);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIsNotVisited() {

		Boolean expectedValue = false;
		Boolean actualValue = testFileOperator.isVisited(key);
		assertEquals(expectedValue, actualValue);
	}
}
