package interview.questions.array;

import java.util.Arrays;

//How to find all Pairs in Array of Integers whose Sum is equal to a given Number

// O(nlogn)

public class PairsInArray_UsingSortedArray {
	public static void main(String args[]) {
		prettyPrint(new int[] { 12, 14, 17, 15, 19, 20, -11 }, 9);
		//prettyPrint(new int[] { 2, 4, 7, 5, 9, 10, -1 }, 9);
	}

	/**
	 * * Given a number finds two numbers from an array so that the sum is equal
	 * to that number k.
	 *  * @param numbers
	 *  * @param k
	 */
	public static void printPairsUsingTwoPointers(int[] numbers, int targetSum) {
		if (numbers.length < 2) {
			return;
		}
		Arrays.sort(numbers);
		
		System.out.println(" Sorted input int array : " + Arrays.toString(numbers));
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == targetSum) {
				System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
				left = left + 1;
				right = right - 1;
			} else if (sum < targetSum) {
				left = left + 1;
			} else if (sum > targetSum) {
				right = right - 1;
			}
		}
	}

	/* * Utility method to print two elements in an array that sum to k. */
	public static void prettyPrint(int[] random, int k) {
		System.out.println("input int array : " + Arrays.toString(random));
		System.out.println("All pairs in an array of integers whose sum is equal to a given value " + k);
		printPairsUsingTwoPointers(random, k);
	}
}