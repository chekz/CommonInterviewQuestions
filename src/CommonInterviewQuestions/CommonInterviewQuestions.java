package CommonInterviewQuestions;
 
public class CommonInterviewQuestions {
	// Check if a string is a palindrome
    public boolean isStringPalindrome(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
       
        if(reverseWord.equals(word)) {
                return true;
        }
       
        return false;
    }
   
    // Remove all occurrences of a character from a string
    public String removeCharactersFromString(String word, char character) {
        String wordWithRemovedCharacters = "";
       
        for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) != character) {
                        wordWithRemovedCharacters += word.charAt(i);
                }
        }
       
        return wordWithRemovedCharacters;
    }
           
    // Print all permutations of a string recursively
    public void printPermutations(String word, int position) {
        if(word.length() == position + 1) {
                System.out.println(word);
                return;
        }
       
        StringBuilder newWord;
       
        for(int i = position; i < word.length() ; i++) {
            newWord = new StringBuilder(word);
            newWord.setCharAt(position, word.charAt(i));
            newWord.setCharAt(i, word.charAt(position));
           
            printPermutations(newWord.toString(),position + 1);
        }
    }
    
    /*      
 		FizzBuzz Test
         
	   	Print out all numbers from 1 to 100
	    Multiples of 3 will print out the word Fizz
	    Multiples of 5 print out the word Buzz
	    Multiples of 3 & 5 print FizzBuzz
    */
    public void fizzBuzzQuestion() {
    	String fizzBuzz = "";
    	
    	for(int i = 1; i <= 100 ; i++) { 
    		fizzBuzz = "";
    		
    		if(i % 3 == 0) {
    			fizzBuzz += "Fizz";
    		}
    		
    		if(i % 5 == 0) {
    			fizzBuzz += "Buzz";
    		}
    		
    		if(fizzBuzz.equals("")) {
    			System.out.println(i);
    		}
    		else {
    			System.out.println(fizzBuzz);
    		}
    	}
    }
}