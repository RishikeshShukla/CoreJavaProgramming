package interview.questions.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//How to find all Pairs in Array of Integers whose Sum is equal to a given Number

// O(n)

public class PairsInArray_UsingSet {
	public static void main(String args[]) {
		prettyPrint(getRandomArray(9), 11);
		//prettyPrint(getRandomArray(10), 12);
	}

	/**
	 * * Given an array of integers finds two elements in the array whose sum is
	 * equal to n. * @param numbers * @param n
	 */
	public static void printPairsUsingSet(int[] numbers, int sum) {
		if (numbers.length < 2) {
			return;
		}
		Set<Integer> set = new HashSet<Integer>(numbers.length);
		
		for (int value : numbers) {
			int target = sum - value;
			
			if (set.contains(target)) {
				System.out.printf("(%d, %d) %n", value, target);
				
			} else {
				// if target number is not in set then add
				set.add(value);
			}
		}
	}

	/* * Utility method to find two elements in an array that sum to k. */
	public static void prettyPrint(int[] random,
			int k) {
		System.out.println("Random Integer array : " + Arrays.toString(random));
		System.out.println("Sum : " + k);
		System.out.println("pair of numbers from an array whose sum equals " + k);
		printPairsUsingSet(random, k);
	}

	/**
	 * * Utility method to return random array of Integers in a range of 0 to 15
	 */
	public static int[] getRandomArray(int length) {
		int[] randoms = new int[length];
		for (int i = 0; i < length; i++) {
			randoms[i] = (int) (Math.random() * 15);
		}
		return randoms;
	}

}
