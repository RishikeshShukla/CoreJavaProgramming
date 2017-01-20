package interview.questions.tree;
 
class Node {

	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree {

	Node root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(int data) {
		root = new Node(data);
	}

}
