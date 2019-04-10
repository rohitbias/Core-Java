package otherprograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String a = s.nextLine();
			char[] chars = a.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			System.out.println(sorted);
			String as[] = { "Amit", "Nitish","Animesh", "Piyush","Arul" };
			Arrays.sort(as);
			for(String x:as)
			System.out.println(x);
			sortString(as);
			s.close();

		}

		public static void sortString(String a[]) {
			int length = a.length;
			String temp = "";
			for (int i = 0; i < length; i++) {
				for (int j = i + 1; j < length; j++) {
					if (a[i].compareTo(a[j]) > 0) // Ascending order in increasing
					//if(a[i]>a[j])								// size
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for (int i1 = 0; i1 <= length - 1; i1++) {
				System.out.println("Sorted String is:" + a[i1]);
			}

		}
	}
