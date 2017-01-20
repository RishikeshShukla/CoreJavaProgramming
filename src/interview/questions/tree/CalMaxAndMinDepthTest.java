package interview.questions.tree;

/**
 * @author Rishikesh Shukla
 * 
 *         Program to count MIN and MAX depth of Tree
 *          Count Leaf nodes
 *          Print Leaf nodes
 *
 */
public class CalMaxAndMinDepthTest {

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

		int maxDepth = calculateMaxDepth(tree.root);

		System.out.println("max depth of Tree : " + maxDepth);

		int minDepth = calculateMinDepth(tree.root);

		System.out.println("min depth of Tree : " + minDepth);

		int leafCount = countLeafNodes(tree.root);

		System.out.println("Leaf nodes of Tree : " + leafCount);
	
		printLeafNodes(tree.root);
		

	}

	private static void printLeafNodes(Node root) {
		if(root == null)
			return ;
		if(root.left == null && root.right == null)
			 System.out.println("Leaf nodes is : " + root.data);
		
		printLeafNodes(root.left);
		printLeafNodes(root.right);
		
	}

	//----------------------------------
	
	private static int countLeafNodes(Node root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		else
			return countLeafNodes(root.left) + countLeafNodes(root.right);
		
	}

	// -------------------------------
	private static int calculateMaxDepth(Node root) {
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		int leftDepth = calculateMaxDepth(root.left) + 1;

		int rightDepth = calculateMaxDepth(root.right) + 1;

		int maxLength = Math.max(leftDepth, rightDepth);

		return maxLength;
	}

	// -------------------------------

	private static int calculateMinDepth(Node root) {
		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		int leftDepth = calculateMinDepth(root.left) + 1;
		int rightDepth = calculateMinDepth(root.right) + 1;

		int maxLength = Math.min(leftDepth, rightDepth);

		return maxLength;
	}

	// -------------------------------

}
