package interview.questions.string;

/*Print all permutation of String both iterative and Recursive way?*/

public class PermutationsString {

	public static void main(String args[]) {
		permuteString("abc", "a");
	}

	public static void permuteString(String beginningString, String endingString) {
		if (endingString.length() <= 1)
			System.out.println(beginningString + endingString);
		else
			for (int i = 0; i < endingString.length(); i++) {
				try {
					String newString = endingString.substring(0, i) + endingString.substring(i + 1);

					permuteString(beginningString + endingString.charAt(i), newString);
				} catch (StringIndexOutOfBoundsException exception) {
					exception.printStackTrace();
				}
			}
	}
}
