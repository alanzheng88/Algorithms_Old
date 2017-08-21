package strings;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class StringAlgorithm {

	/*
	 * O(N) implementation with data structures
	 */
	public static boolean hasUniqueCharactersWithDs(String s) {
		String[] splitted = s.split("");
		Set<String> uniqueStrSet = new HashSet<>();
		for (String ch : splitted) {
			uniqueStrSet.add(ch);
		}
		return uniqueStrSet.size() == splitted.length;
	}
	
	/*
	 * O(N^2) implementation without data structures
	 */
	public static boolean hasUniqueCharactersWithoutDs(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * O(N) implementation
	 */
	public static String reverseString(String s) {
		int nullTerminatorIndex = -1;
		String nullTerminator = "\0";
		if (s.contains(nullTerminator)) {
			nullTerminatorIndex = s.indexOf(nullTerminator);
		}
		
		String reversedString = "";
		int index;
		if (nullTerminatorIndex == -1) {
			index = s.length() - 1;
			while (index >= 0) {
				reversedString += s.charAt(index);
				index--;
			}
		} else {
			index = nullTerminatorIndex - 1;
			while (index >= 0) {
				reversedString += s.charAt(index);
				index--;
			}
			reversedString += "\0";
		}
		return reversedString;
	}

	/*
	 * O(N^2) implementation
	 */
	public static String removeDuplicateCharacters(String s) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (i = 0; i < s.length(); i++) {
			String ch = String.valueOf(s.charAt(i));
			if (sb.indexOf(ch) == -1) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	/*
	 * O(N) implementation
	 */
	public static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) return false;
		String aLowerCase = a.toLowerCase();
		String bLowerCase = b.toLowerCase();
		int[] aAlphabets = new int[26];
		int[] bAlphabets = new int[26];
		for (Character c : aLowerCase.toCharArray()) {
			aAlphabets[(int)(c - 'a')]++; 
		}
		for (Character c : bLowerCase.toCharArray()) {
			bAlphabets[(int)(c - 'a')]++;
		}
 		return Arrays.equals(aAlphabets, bAlphabets);
	}
	
	private static void permutation(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}
	
	public static void countPermutations(String str) {
		permutation(str, "");
	}

}
