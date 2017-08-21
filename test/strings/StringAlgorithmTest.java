package strings;

import org.junit.Test;

import strings.StringAlgorithm;

import static org.junit.Assert.*;

public class StringAlgorithmTest {
	
	@Test
	public void testHasUniqueCharactersShouldReturnTrue() {
		String s = "abcdefghijkl";
		boolean result = StringAlgorithm.hasUniqueCharactersWithDs(s);
		assertEquals(true, result);
	}
	
	@Test
	public void testHasUniqueCharactersOptimizedShouldReturnTrue() {
		String s = "abcdefghijkl";
		boolean result = StringAlgorithm.hasUniqueCharactersWithoutDs(s);
		assertEquals(true, result);
	}
	
	@Test
	public void testHasNonUniqueCharactersShouldReturnFalse() {
		String s = "abcdefghhijkl";
		boolean result = StringAlgorithm.hasUniqueCharactersWithDs(s);
		assertEquals(false, result);
	}
	
	@Test
	public void testHasNonUniqueCharactersOptimizedShouldReturnFalse() {
		String s = "abcdefghhijkl";
		boolean result = StringAlgorithm.hasUniqueCharactersWithoutDs(s);
		assertEquals(false, result);
	}
	
	@Test
	public void testReverseCStringShouldReturnReverseStringWithNullTerminator() {
		String s = "abcd\0";
		String result = StringAlgorithm.reverseString(s);
		assertEquals("dcba\0", result);
	}
	
	@Test
	public void testReverseRegularStringShouldReturnReverseString() {
		String s = "abcd";
		String result = StringAlgorithm.reverseString(s);
		assertEquals("dcba", result);
	}
	
	@Test
	public void testReverseEmptyStringShouldReturnEmptyString() {
		String s = "";
		String result = StringAlgorithm.reverseString(s);
		assertEquals("", result);
	}
	
	@Test
	public void testRemoveDuplicateCharactersShouldReturnStringWithNoDuplicates() {
		String s = "aabbbccccddd";
		String result = StringAlgorithm.removeDuplicateCharacters(s);
		assertEquals("abcd", result);
	}
	
	@Test
	public void testRemoveStringWithNoDuplicateCharactersShouldReturnOriginalString() {
		String s = "abcd";
		String result = StringAlgorithm.removeDuplicateCharacters(s);
		assertEquals("abcd", result);
	}
	
	@Test
	public void testRemoveEmptyStringShouldReturnEmptyString() {
		String s = "";
		String result = StringAlgorithm.removeDuplicateCharacters(s);
		assertEquals("", result);
	}
	
	@Test
	public void testIsAnagramWithStringOfSameLengthShouldReturnTrue() {
		String a = "alnzhe";
		String b = "nlahze";
		boolean result = StringAlgorithm.isAnagram(a, b);
		assertEquals(true, result);
	}
	
	@Test
	public void testIsAnagramWithStringOfDifferentLengthShouldReturnFalse() {
		String a = "alnhe";
		String b = "nlahzed";
		boolean result = StringAlgorithm.isAnagram(a, b);
		assertEquals(false, result);
	}
	
	@Test
	public void testIsAnagramWithSameCharactersOfMixedCasesShouldReturnTrue() {
		String a = "alnhe";
		String b = "hEnAL";
		boolean result = StringAlgorithm.isAnagram(a, b);
		assertEquals(true, result);
	}
	
	@Test
	public void testEmptyAnagramShouldReturnTrue() {
		String a = "";
		String b = "";
		boolean result = StringAlgorithm.isAnagram(a, b);
		assertEquals(true, result);
	}
	
	@Test
	public void testInvalidAnagramShouldReturnFalse() {
		String a = "alnhe";
		String b = "hlnhe";
		boolean result = StringAlgorithm.isAnagram(a, b);
		assertEquals(false, result);
	}
	
	@Test
	public void testPermutation() {
		String a = "alanz";
		StringAlgorithm.countPermutations(a);
	}

}
