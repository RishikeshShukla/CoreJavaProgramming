package interview.questions.list;

import java.util.Arrays;
import java.util.List;

public class Testmain {
	public static void main(String[] args) {

		/*
		 * List<Integer> list = new ArrayList<Integer>(7); Set<Integer> set =
		 * new HashSet<Integer>(7); Map<Integer, Integer> map = new
		 * HashMap<Integer, Integer>(7);
		 * 
		 */

		Integer[] arr = new Integer[] { 1, 2, 3, 4 };
		List<Integer> listI = Arrays.asList(arr);

		System.out.println(listI.size());

		listI.add(5);
		listI.add(6);

		System.out.println(listI.size());

		// map.

	}
}
