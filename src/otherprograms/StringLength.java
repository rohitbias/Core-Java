package otherprograms;

public class StringLength {
	
	public static void main(String[] args) {
		
		String a = "Rohit";
		lengthString(a);
	}

	public static void lengthString(String a) {
		int i = 0;
		try {
			while (true) {
				a.charAt(i);
				i++;
			}
		} catch (Exception e) {
			System.out.println("The Length of String is " + i);
		}

	}

}
