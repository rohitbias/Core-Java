package stringprograms;

public class RemoveCharacter {
	
	public static void main(String[] args) {

		String str = "This is year 2019 and I was born in 1989.";
		System.out.println(removeCharacter(str));
	}

	public static String removeCharacter(String str) {

		return str.replaceAll("[A-Za-z\\.]","").trim(); 
		 
	}
}
