package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = {"Wah", "Bleh", "Ugh", "Uh-huh", "Nuh-uh"};
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "Hmm";
		//4. print the third element again
		System.out.println(arr[2]);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "Huh";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("/");
		
		//7. make an array of 50 integers
		int[] arr0 = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < arr0.length; i++) {
			arr0[i] = new Random().nextInt(50);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int min = 50;
		for (int i = 0; i < arr0.length; i++) {
			if (arr0[i] < min) {
				min = arr0[i];
			}
		}
		
		System.out.println(min);
		System.out.println("/");
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < arr0.length; i++) {
			System.out.println(arr0[i]);
		}
		
		System.out.println("/");
		//11. print the largest number in the array.
		int max = 0;
		for (int i = 0; i < arr0.length; i++) {
			if (arr0[i] > max) {
				max = arr0[i];
			}
		}
		
		System.out.println(max);
		System.out.println("/");
		//12. print only the last element in the array
		System.out.println(arr0[49]);
	}
}
