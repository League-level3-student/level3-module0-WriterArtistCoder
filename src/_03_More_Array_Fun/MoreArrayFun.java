package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		printStrings(new String[] {"a", "b", "c", "d"});
		System.out.println("_");
		printStringsReverse(new String[] {"a", "b", "c", "d"});
		System.out.println("_");
		printStringsHalf(new String[] {"a", "b", "c", "d"});
		System.out.println("_");
		printStringsRandom(new String[] {"a", "b", "c", "d"});
		System.out.println("_");
	}
	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStrings(String[] arr) {
		for (String s : arr) {
			System.out.println(s);
		}
	}
	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void printStringsReverse(String[] arr) {
		for (int i = arr.length-1; i > -1; i--) {
			System.out.println(arr[i]);
		}
	}
	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void printStringsHalf(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (Math.floor((double) i / 2) == (double) i / 2) {
				System.out.println(arr[i]);
			}
		}
	}
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void printStringsRandom(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int r = new Random().nextInt(arr.length);
			String s = arr[i];
			arr[i] = arr[r];
			arr[r] = s;
		}
		printStrings(arr);
	}

}
