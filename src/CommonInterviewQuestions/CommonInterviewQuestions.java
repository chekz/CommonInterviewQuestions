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
        public void printPermutationsRecursive(String word, int position) {
                if(word.length() == position + 1) {
                        System.out.println(word);
                        return;
                }
               
                StringBuilder newWord;
               
                for(int i = position; i < word.length() ; i++) {
                        newWord = new StringBuilder(word);
                        newWord.setCharAt(position, word.charAt(i));
                        newWord.setCharAt(i, word.charAt(position));
                       
                        printPermutationsRecursive(newWord.toString(),position + 1);
                }
        }
}