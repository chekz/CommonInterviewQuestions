package CommonInterviewQuestions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IsStringPalindromeTest {
	CommonInterviewQuestions commonInterviewQuestions;
	
	@Before
	public void init() {
		commonInterviewQuestions = new CommonInterviewQuestions();
	}
	
	@Test
	public void testThatStringIsAPalindrome() {
		boolean isPalindrome = commonInterviewQuestions.isStringPalindrome("piiiip");
		assertTrue(isPalindrome);
	}
	
	@Test
	public void testThatStringIsNotAPalindrome() {
		boolean notPalindrome = commonInterviewQuestions.isStringPalindrome("Not");
		assertFalse(notPalindrome);
	}
}
