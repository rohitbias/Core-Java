package otherprograms;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 0, c = 1, n;
		System.out.println("Enter the limit");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
			sc.close();

		}
	}
}

