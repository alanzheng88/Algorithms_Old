package arrays;

public class ArrayAlgorithm {

	private static final String EXCEPTION_MESSAGE = "Could not find min element";

	/*
	 * O(N) implementation
	 */
	public static int findPivot(int[] elements) {
		if (elements == null || elements.length == 0) {
			return -1;
		}
		
		boolean hasOnlyOneElement = elements.length == 1;
		boolean isSortedInAscendingOrder = elements[elements.length - 1] > elements[0];
		if (hasOnlyOneElement || isSortedInAscendingOrder) {
			// array is already sorted in ascending order
			return 0;
		}
		
		int lastIndex = 0;
		int index = 0;
		while (index < elements.length) {
			if (elements[index] < elements[lastIndex]) {
				return index;
			}
			lastIndex = index;
			index++;
		}
		return -1;
	}
	
	public static int findMinElementFromSortedRotatedArray(int[] elements) throws Exception {
		int pivot = findPivot(elements);
		if (pivot == -1) {
			throw new Exception(EXCEPTION_MESSAGE);
		} else if (pivot == 0) {
			return elements[0];
		}
		return elements[pivot];
	}

	/*
	 * O(logN) implementation
	 */
	public static int findMinElementFromSortedRotatedArrayOptimized(int[] elements) throws Exception {
		// one side of the array is always sorted
		if (elements == null || elements.length == 0) {
			throw new Exception(EXCEPTION_MESSAGE);
		}
		
		boolean hasOnlyOneElement = elements.length == 1;
		boolean isSortedInAscendingOrder = elements[elements.length - 1] > elements[0];
		if (hasOnlyOneElement || isSortedInAscendingOrder) {
			return elements[0];
		}
		
		int midIndex = elements.length / 2;
		int left = 0;
		int right = elements.length;
		while (right > left) {
			if (elements[midIndex] < elements[midIndex - 1]) {
				// found reset point
				return elements[midIndex];
			}
			if (elements[midIndex] > elements[left]) {
				// left side of array is sorted, process right side of array
				left = midIndex;
			} else {
				// right side of array is sorted, process left side of array
				right = midIndex;
			}
			midIndex = (left + right) / 2; 
		}
		throw new Exception(EXCEPTION_MESSAGE);
	}
	

}
