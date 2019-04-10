package searchinprograms;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String args[]) {
		int[] a = { 10, 20, 98, 13, 22, 45, 77, 81 };
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		linearSearch(a, number);
		s.close();
	}

	public static void linearSearch(int a[], int number) {
		boolean found = false;
		int location = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == number) {
				found = true;
				location = i;
				break;
			}
		}
		if (found == true)
			System.out.println("Number is present at index " + location);
		else
			System.out.println("NOT FOUND");
	}

}
