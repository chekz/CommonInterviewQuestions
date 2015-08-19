package CommonInterviewQuestions;

public class CommonInterviewQuestions {
	// Write a method to see if a string is a palindrome or not
	public boolean isStringPalindrome(String word) {
		String reverseWord = new StringBuilder(word).reverse().toString();
		
		if(reverseWord.equals(word)) {
			return true;
		}
		
		return false;
	}
	
	// Write a method which will remove any given character from a String
	public String removeCharacterFromString(String word, char character) {
		StringBuilder newString = new StringBuilder(word);
		
		int wordLength = word.length();
		
		for(int i = 0; i < wordLength; i++) { 
			if(word.charAt(i) == character) {
				newString.deleteCharAt(i);
				word = newString.toString();
				wordLength--;
				i--;
			}
		}
		
		return newString.toString();
	}
}
