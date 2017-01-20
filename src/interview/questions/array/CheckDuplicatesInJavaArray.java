package interview.questions.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesInJavaArray {
	/*
	 * detect duplicate in array by comparing size of List and Set since Set
	 * doesn't contain duplicate, size must be less for an array which contains
	 * duplicates
	 */

	public static boolean checkDuplicateUsingSet(String[] input) {

		List inputList = Arrays.asList(input);
		Set inputSet = new HashSet(inputList);
		if (inputSet.size() < inputList.size()) {
			return true;
		}
		return false;
	}

	/*
	 * brute force way of checking if array contains duplicates in Java
	 * comparing each element to all other elements of array complexity on order
	 * of O(n^2) not advised in production
	 */

	public static boolean bruteforce(String[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i].equals(input[j]) && i != j) {
					return true;
				}
			}

		}
		return false;
	}
}
