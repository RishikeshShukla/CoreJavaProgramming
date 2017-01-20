package interview.questions.string;

import java.util.Stack;

public class DuplicateParentheses {
	public static void main(String[] args) {

		String inputStr = "((a+b)+((c))+d))";

		boolean result = findDuplicateParentheses(inputStr);
		
		if(result)
			System.out.println("Duplicate found !!!");
		else
			System.out.println("No Duplicate Present");
	}

	private static boolean findDuplicateParentheses(String inputStr) {

		char[] charArray = inputStr.toCharArray();

		Stack<Character> stack = new Stack<Character>();
		for (char c : charArray) {

			if (c == ')') {

				char top = stack.pop();

				if (top == '(')
					return true;
				else {
					while (top != '(') {
						top = stack.pop();
					}
				}

			} else {
				stack.push(c);
			}
		}
		return false;
	}
}
