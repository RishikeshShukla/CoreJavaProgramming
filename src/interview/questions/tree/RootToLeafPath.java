package interview.questions.tree;

/**
 * @author Rishikesh Shukla
 *
 *         Given a binary tree, print out all of its root-to-leaf paths one per
 *         line.
 */
public class RootToLeafPath {
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

		int pathArr[] = new int[100];
		int pathLen = 0;
		printRootToLeafPath(tree.root, pathArr, pathLen);
	}

	private static void printRootToLeafPath(Node root, int[] pathArr, int pathLen) {

		if (root == null)
			return;

		pathArr[pathLen] = root.data;
		pathLen++;

		if (root.left == null && root.right == null)
			printPathArray(pathArr, pathLen);

		printRootToLeafPath(root.left, pathArr, pathLen);
		printRootToLeafPath(root.right, pathArr, pathLen);
	}

	private static void printPathArray(int[] pathArr, int pathLen) {

		for (int i = 0; i < pathLen; i++)
			System.out.print(pathArr[i] + " ");

		System.out.println();
	}
}
