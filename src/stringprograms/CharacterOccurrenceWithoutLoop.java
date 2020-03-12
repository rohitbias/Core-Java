package stringprograms;

public class CharacterOccurrenceWithoutLoop {

	public static void main(String[] args) {

		String str = "This is an Example of The Character";
		String ch = "m";
		System.out.println(characterOccurrence(str, ch));
	}

	public static int characterOccurrence(String str, String ch) {

		return str.length() - str.replaceAll(ch, "").length();
		 
	}
}
