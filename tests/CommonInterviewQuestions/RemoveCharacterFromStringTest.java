package CommonInterviewQuestions;

import static org.junit.Assert.assertTrue;

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
		
		assertTrue(wordWithRemovedLetters.equals("Hllo"));
	}
	
	@Test
	public void testCharacterDoesNotGetRemovedFromString() {
		String testWord = "eHeeelloe";
		String wordWithRemovedLetters = commonInterviewQuestions.removeCharacterFromString(testWord, 'f');
		
		assertTrue(wordWithRemovedLetters.equals(testWord));
	}
}
