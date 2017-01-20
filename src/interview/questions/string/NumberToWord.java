package interview.questions.string;

/** convert input number into word */

// 8948548097
// 8853840770
public class NumberToWord {

	static String[] ONES = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	static String[] TENS = { "", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninenty" };

	public static void main(String[] args) {

		String value = convert(1111809);
		System.out.println(value);
	}

	private static String convert(int i) {
		if (i < 20)
			return ONES[i];
		if (i < 100)
			return TENS[i / 10] + (i % 10 > 0 ? " " + convert(i % 10) : "");
		if (i < 1000)
			return ONES[i / 100] + " Hundred " + (i % 100 > 0 ? "" + convert(i % 100) : "");
		if (i < 1000000)
			return convert(i / 1000) + " Thousand " + ((i % 1000 > 0) ? "" + convert(i % 1000) : "");

		return convert(i / 1000000) + " Million " + ((i % 1000000 > 0) ? "" + convert(i % 1000000) : "");
	}
}
