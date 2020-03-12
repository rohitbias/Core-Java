package stringprograms;

public class RemoveNumbers {

	public static void main(String[] args) {

		String str = "This is year 2019 and I was born in 1989.";
		System.out.println(removeIntegers(str));
	}

	public static String removeIntegers(String str) {

		return str.replaceAll("[0-9]", "").trim();

	}
}
