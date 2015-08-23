package CommonInterviewQuestions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveCharacterFromStringTest {
	CommonInterviewQuestions commonInterviewQuestions;
	
	@Before
	public void init() {
		commonInterviewQuestions = new CommonInterviewQuestions();
	}
	
	@Test
	public void testCharacterGetsRemovedFromString() {
		String testWord = "eHeeelloe";
		String wordWithRemovedLetters = commonInterviewQuestions.removeCharacterFromString(testWord, 'e');
		String expectedResult = "Hllo";
		
		assertEquals(wordWithRemovedLetters, expectedResult);
	}
}
