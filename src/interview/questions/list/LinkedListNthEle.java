package interview.questions.list;

import interview.questions.list.LinkedList.Node;

public class LinkedListNthEle {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(20);
		list.add(4);
		list.add(15);
		list.add(35);
		list.add(100);

		printNthFromLast(list, 6);
	}

	/* method to get the nth node from end of list */
	
	static void printNthFromLast(LinkedList list, int n) {
		Node head = list.getHead();
		Node main_ptr = head;
		Node ref_ptr = head;

		int count = 0;
		
		if (head != null) {
			while (count < n) {
				if (ref_ptr == null) {
					System.out.println(n + " is greater than the no " + " of nodes in the list");
					return;
				}
				ref_ptr = ref_ptr.next;
				count++;
			}
			while (ref_ptr != null) {
				main_ptr = main_ptr.next;
				ref_ptr = ref_ptr.next;
			}
			System.out.println("Node no. " + n + " from last is " + main_ptr.data);
		}
	}
}
