package otherprograms;

import java.util.Scanner;

public class CharacterOccurance {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String search = s.nextLine();

		int length = a.length();
		int count = 0;
		for (int i = 0; i <length; i++) {
			if (a.charAt(i) == search.charAt(0))
				count++;
		}
		System.out.println("Total Occurance for " + search + " " + count);
		s.close();

	}
}

