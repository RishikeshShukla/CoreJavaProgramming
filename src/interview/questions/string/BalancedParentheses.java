package interview.questions.string;

import java.util.Stack;

/**
 * Check for balanced parentheses in an expression Given an expression string
 * 
 * Example, write a program to examine whether the pairs and the orders of
 * “{“,”}”,”(“,”)”,”[“,”]” are correct in expression. For example, the program
 * should print true for expression = “[()]{}{[()()]()}” and false for
 * expression = “[(])”
 */
public class BalancedParentheses {

	public static void main(String[] args) {

		String inputExp = "{()}[]";

		boolean isBalanced = areParenthesesBalanced(inputExp);

		if (isBalanced)
			System.out.println("Parentheses Balanced :)");
		else
			System.out.println("Parentheses Not Balanced !!!");

		// if(stack.isEmpty())

	}

	private static boolean areParenthesesBalanced(String inputExp) {

		char[] inputExpArr = inputExp.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for (char c : inputExpArr) {

			/* If the char c is a starting parenthesis then push it */
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			}

			/*
			 * If char c is a ending parenthesis then pop from stack and check
			 * if the popped parenthesis is a matching pair
			 */

			if (c == ']' || c == '}' || c == ')') {

				if (stack.isEmpty() || !isMatchingPair(c, stack)) {
					return false;
				}

			}

		}

		/*
		 * If there is something left in expression then there is a starting
		 * parenthesis without a closing parenthesis
		 */
		if (stack.isEmpty())
			return true;
		else
			return false;

	}

	private static boolean isMatchingPair(char c, Stack<Character> stack) {
		char stChar = stack.pop();
		if (stChar == '[' && c == ']')
			return true;
		if (stChar == '{' && c == '}')
			return true;
		if (stChar == '(' && c == ')')
			return true;
		return false;
	}

}
