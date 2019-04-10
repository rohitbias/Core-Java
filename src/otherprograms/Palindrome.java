package otherprograms;

import java.util.Scanner;

public class Palindrome {


		public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
			String a = s.nextLine();
			int length = a.length();
			String output = "";
			System.out.println(length);
			for (int i = length - 1; i >= 0; i--) {
				output = output + a.charAt(i);

			}
			s.close();
			System.out.println(output);
			if (a.equals(output))
				System.out.println("Palindrome a Palindrome");
			else
				System.out.println("Not a Palindrome");
		}
		
	}


