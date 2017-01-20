package interview.questions.list;

public class LinkedList {
	// head of list
	private Node head;

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void add(int data) {

		/* create Node & Put in the data */
		Node new_node = new Node(data);

		/* 3. Make next of new Node as head */
		new_node.next = getHead();

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}


}
