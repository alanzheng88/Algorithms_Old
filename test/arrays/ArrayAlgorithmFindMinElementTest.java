package arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import arrays.ArrayAlgorithm;

public class ArrayAlgorithmFindMinElementTest {

	@Before
	public void setUp() throws Exception {
	}
	
	
	@Test
	public void testOddNumberOfIntegerElements() throws Exception {
		int[] elements = {5, 6, 7, 8, 9, 1, 2, 3, 4};
		int result = ArrayAlgorithm.findMinElementFromSortedRotatedArray(elements);
		assertEquals(1, result);
	}
	
	@Test
	public void testOddNumberOfIntegerElementsOptimized() throws Exception {
		int[] elements = {5, 6, 7, 8, 9, 1, 2, 3, 4};
		int result = ArrayAlgorithm.findMinElementFromSortedRotatedArrayOptimized(elements);
		assertEquals(1, result);
	}
	
	@Test
	public void testEvenNumberOfIntegerElements() throws Exception {
		int[] elements = {5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
		int result = ArrayAlgorithm.findMinElementFromSortedRotatedArray(elements);
		assertEquals(1, result);
	}
	
	@Test
	public void testEvenNumberOfIntegerElementsOptimized() throws Exception {
		int[] elements = {5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
		int result = ArrayAlgorithm.findMinElementFromSortedRotatedArrayOptimized(elements);
		assertEquals(1, result);
	}
	
	@Test(expected = Exception.class)
	public void testNullArray() throws Exception {
		int[] elements = null;
		ArrayAlgorithm.findMinElementFromSortedRotatedArray(elements);
	}
	
	@Test(expected = Exception.class)
	public void testNullArrayOptimized() throws Exception {
		int[] elements = null;
		ArrayAlgorithm.findMinElementFromSortedRotatedArrayOptimized(elements);
	}
	
	@Test
	public void testArrayWithOddNumberOfIntegerElementsAndContainsOneNegativeElement() throws Exception {
		int[] elements = {5, 6, 7, 8, 9, -1, 0, 1, 2, 3, 4};
		int result = ArrayAlgorithm.findMinElementFromSortedRotatedArray(elements);
		assertEquals(-1, result);
	}
	
	@Test
	public void testArrayWithOddNumberOfIntegerElementsAndContainsOneNegativeElementOptimized() throws Exception {
		int[] elements = {5, 6, 7, 8, 9, -1, 0, 1, 2, 3, 4};
		int result = ArrayAlgorithm.findMinElementFromSortedRotatedArrayOptimized(elements);
		assertEquals(-1, result);
	}
	
	@Test
	public void testSortedAscendingIntegerElements() throws Exception {
		int[] elements = {0, 1, 2, 3, 4, 5};
		int result = ArrayAlgorithm.findMinElementFromSortedRotatedArray(elements);
		assertEquals(0, result);
	}
	
	@Test
	public void testSortedAscendingIntegerElementsOptimized() throws Exception {
		int[] elements = {0, 1, 2, 3, 4, 5};
		int result = ArrayAlgorithm.findMinElementFromSortedRotatedArrayOptimized(elements);
		assertEquals(0, result);
	}
}
