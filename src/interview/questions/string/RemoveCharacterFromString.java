package interview.questions.string;

/*Remove any given character from a String.*/

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		System.out.println(removeCharInString("My name is rampravesh kumara", 'a'));
	}

	public static String removeCharInString(String str, char charToBeRemoved) {

		//here replace will not work bcoz of new char required some value
		if (str == null)
			return "";

		StringBuilder strBuild = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == charToBeRemoved)
				continue;
			strBuild.append(ch);
		}
		return strBuild.toString();
	}

}
