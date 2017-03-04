package interview.questions.tree;

public class MaxandMinElementInTree {
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);

		tree.root.right.left = new Node(8);
		tree.root.right.right = new Node(9);

		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.right = new Node(7);

		int maxElement = findMaxElement(tree.root);

		System.out.println("Max element in Tree " + maxElement);

		int minElement = findMinElement(tree.root);

		System.out.println("Min element in Tree " + minElement);

	}

	private static int findMinElement(Node root) {
		if (root != null) {
			return min(root.data, findMinElement(root.left), findMinElement(root.right));
		}
		return 0;

	}

	public static int min(int a, int b, int c) {
		return (Math.min(a, Math.min(b, c)));
	}

	private static int findMaxElement(Node root) {
		if (root != null) {
			return max(root.data, findMaxElement(root.left), findMaxElement(root.right));
		}
		return 0;
	}

	public static int max(int a, int b, int c) {
		return (Math.max(a, Math.max(b, c)));
	}

}
