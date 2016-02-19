package tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.*;

import my.implementation.FileHolder;
import my.implementation.FileOperator;

public class FileOperatorTest {

	private File fileName;
	private FileHolder testFileHolder;
	private FileOperator testFileOperator;

	@Before
	public void initalize() {
		fileName = new File("/home/ruzha/Desktop/TestDirectory/test_1/test_1_1/interfaceList.txt");
		testFileHolder = new FileHolder();
		testFileOperator = new FileOperator(testFileHolder);
	}

	@Test
	public void testIsVisited() {
		testFileOperator.tryVisitFile(fileName.toString());
		Boolean actualValue = testFileOperator.isVisited(fileName.toString());
		assertEquals(true, actualValue);
	}

	@Test
	public void testIsNotVisited() {
		Boolean actualValue = testFileOperator.isVisited(fileName.toString());
		assertEquals(false, actualValue);
	}
	
	@Test
	public void testReadLines() throws FileNotFoundException, IOException {
		testFileOperator.readLines(fileName);
		assertFalse(testFileHolder.isEmpty());
	}
}
