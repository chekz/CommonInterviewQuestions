package CommonInterviewQuestions;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class AllPermutationsOfAStringRecursiveTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	CommonInterviewQuestions commonInterviewQuestions;
	
	@Before
	public void init() {
		System.setOut(new PrintStream(outContent));
		commonInterviewQuestions = new CommonInterviewQuestions();
	}
	
	@Test
	public void printAllPermutationsOfAStringRecursiveTest() {
		String stringToPermute = "abc";
		String expectedResult = "abc\nacb\nbac\nbca\ncba\ncab";
		commonInterviewQuestions.printPermutationsRecursive(stringToPermute,0);
		assertEquals(expectedResult, outContent.toString());
	}
}
