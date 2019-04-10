package otherprograms;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Binary String: ");
		int number = s.nextInt();
		int counter = 0;
		int result = 0;
		while (number != 0) {
			// Obtaining the remainder of the division and multiplying it
			// with the number raised to two

			// adding it up with the previous result

			result += (number % 10) * Math.pow(2, counter);

			number /= 10; // removing one digit from the binary number

			// Increasing counter 2^0, 2^1, 2^2, 2^3.....
			counter++;

		}
		System.out.println("The Decimal number is :" + result);
		s.close();
	}

}

