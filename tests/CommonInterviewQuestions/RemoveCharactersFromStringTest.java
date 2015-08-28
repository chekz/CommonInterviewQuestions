package CommonInterviewQuestions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveCharactersFromStringTest {
	CommonInterviewQuestions commonInterviewQuestions;
	
	@Before
	public void init() {
		commonInterviewQuestions = new CommonInterviewQuestions();
	}
	
	@Test
	public void testCharactersGetsRemovedFromString() {
		String testWord = "eHeeelloe";
		String wordWithRemovedLetters = commonInterviewQuestions.removeCharactersFromString(testWord, 'e');
		String expectedResult = "Hllo";
		
		assertEquals(wordWithRemovedLetters, expectedResult);
	}
}
