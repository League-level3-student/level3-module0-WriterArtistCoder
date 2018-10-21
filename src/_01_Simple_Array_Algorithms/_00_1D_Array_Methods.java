package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	// 1. Complete the method so that it returns the sum of all
	// of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		int sum = 0;
		for (int x : values) {
			sum += x;
		}

		return sum;
	}

	// 2. Complete the method so that it returns the average of all
	// of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		return (double) sumIntArray(values) / values.length;
	}

	// 3. Complete the method so that it returns true if the integer
	// array contains the value specified by the second parameter.
	// It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		boolean contains = false;
		for (int x : array) {
			if (x == value) {
				contains = true;
			}
		}

		return contains;
	}

	// 4. Complete the method so that it returns the index of the,
	// first instance that the specified value occurs in the array.
	// If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (x == value) {
				return i;
			}
		}
		
		return -1;
	}
}
