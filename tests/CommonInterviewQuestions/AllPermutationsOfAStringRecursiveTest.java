package CommonInterviewQuestions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AllPermutationsOfAStringRecursiveTest {
	CommonInterviewQuestions commonInterviewQuestions;
	
	@Before
	public void init() {
		commonInterviewQuestions = new CommonInterviewQuestions();
	}
	
	@Test
	public void printAllPermutationsOfAStringRecursiveTest() {
		String stringToPermute = "abc";
		String expectedResult = "abc\nacb\nbac\nbca\ncba\ncab";
		//assertEquals(commonInterviewQuestions.printPermutationsIterative(stringToPermute));
	}
}
