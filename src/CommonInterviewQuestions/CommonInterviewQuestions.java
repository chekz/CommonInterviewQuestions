package CommonInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class CommonInterviewQuestions {
	// Check if a string is a palindrome
	public boolean isPalindrome(String word) {
		String reverseWord = new StringBuilder(word).reverse().toString();

		if (reverseWord.equals(word)) {
			return true;
		}

		return false;
	}

	// Get longest palindrome in a string
	public String getLongestPalindrome(String string) {
		String longestPalindrome = "";
		String longestPalindromeInSubstring = "";
		
		for(int i = 0; i < string.length() ; i++) { 
			longestPalindromeInSubstring = getLongestPalindromeInSubstring(string.substring(i));
			
			if(longestPalindromeInSubstring.length() > longestPalindrome.length()) {
				longestPalindrome = longestPalindromeInSubstring;
			}
		}
		
		return longestPalindrome;
	}
	
	public String getLongestPalindromeInSubstring(String string) {
		String longestPalindrome = "";
		String tempString;
		
		for(int i = 0; i < string.length() ; i++) { 
			tempString = string.substring(0, i + 1);
			
			if(isPalindrome(tempString)) {
				longestPalindrome = tempString;
			}
		}
		
		return longestPalindrome;
	}

	// Remove all occurrences of a character from a string
	public String removeCharactersFromString(String word, char character) {
		String wordWithRemovedCharacters = "";

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != character) {
				wordWithRemovedCharacters += word.charAt(i);
			}
		}

		return wordWithRemovedCharacters;
	}

	// Print all permutations of a string recursively
	public void printPermutations(String word, int position) {
		if (word.length() == position + 1) {
			System.out.println(word);
			return;
		}

		StringBuilder newWord;

		for (int i = position; i < word.length(); i++) {
			newWord = new StringBuilder(word);
			newWord.setCharAt(position, word.charAt(i));
			newWord.setCharAt(i, word.charAt(position));

			printPermutations(newWord.toString(), position + 1);
		}
	}
	
	//Print all permutations of a string iteratively 
	public static void printPermutations(String word) {
		if(word.length() == 0) {
			throw new RuntimeException("There is no possible permutaitons");
		}
		
		if(word.length() == 1) {
			System.out.println(word);
		}
		
		List<String> permutations = Arrays.asList(word.substring(0,1));
		
		for(int i = 1; i < word.length() ; i++) { 
			permutations = mergeWord(permutations, word.charAt(i));
		}
		
		for(int i = 0; i < permutations.size() ; i++) { 
			System.out.println(permutations.get(i));
		}
	}
	
	// Puts new chracter at every position in every string in the list of permutations.
	public static List<String> mergeWord(List<String> permutations, char character) {
		List<String> newPermutations = new ArrayList<String>();
		String newWord;
		
		for(int i = 0; i < permutations.size() ; i++) { 
			for(int j = 0; j <= permutations.get(i).length(); j++) { 
				newWord = permutations.get(i).substring(0, j) + character + permutations.get(i).substring(j);
				newPermutations.add(newWord);
			}
		}
		
		return newPermutations;
	}

	/*
	 * FizzBuzz Test
	 * 
	 * Print out all numbers from 1 to 100 Multiples of 3 will print out the
	 * word Fizz Multiples of 5 print out the word Buzz Multiples of 3 & 5 print
	 * FizzBuzz
	 */
	public void fizzBuzz() {
		String fizzBuzz = "";

		for (int i = 1; i <= 100; i++) {
			fizzBuzz = "";

			if (i % 3 == 0) {
				fizzBuzz += "Fizz";
			}

			if (i % 5 == 0) {
				fizzBuzz += "Buzz";
			}

			if (fizzBuzz.equals("")) {
				System.out.println(i);
			} else {
				System.out.println(fizzBuzz);
			}
		}
	}

	// Count the number of times a character occurs in a string
	public int getCharacterOccurences(String string, char character) {
		int characterCounter = 0;
		
		for(int i = 0; i < string.length() ; i++) { 
			if(string.charAt(i) == character) {
				characterCounter++;
			}
		}
		
		return characterCounter;
	}
	
	// Find first non-repeated character of a string
	public char getFirstNonRepeatedCharacter(String word) {
		char currentCharacter = '\0';
		
		LinkedHashMap<Character, Integer> characterOccuerences = new LinkedHashMap<Character, Integer>();
		
		for(int i = 0; i < word.length(); i++) { 
			currentCharacter = word.charAt(i);
			
			if(characterOccuerences.containsKey(currentCharacter)) {
				characterOccuerences.put(currentCharacter, characterOccuerences.get(currentCharacter) + 1);
			}
			else {
				characterOccuerences.put(currentCharacter, 1);
			}
		}
		
		for(Entry<Character, Integer> entry : characterOccuerences.entrySet()) { 
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		
		throw new RuntimeException("Didn't find any non repeated character");
	}
	
	// Check if two strings are anagrams of one another
	public boolean isAnagram(String firstWord, String secondWord) {
		if(firstWord.length() != secondWord.length()) {
			return false;
		}
		
		char[] firstWordChars = firstWord.toCharArray();
		char[] secondWordChars = secondWord.toCharArray();
		
		Arrays.sort(firstWordChars);
		Arrays.sort(secondWordChars);
		
		return Arrays.equals(firstWordChars, secondWordChars);
	}
}