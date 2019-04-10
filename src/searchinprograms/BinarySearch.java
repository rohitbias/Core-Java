package searchinprograms;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

		public static void main(String args[]) {
			int[] a = { 70, 30, 37, 63, 42, 65, 17, 8 };
			Scanner s = new Scanner(System.in);
			int number = s.nextInt();
			Arrays.sort(a);
			binarySearch(a, number);
			s.close();
		}

		private static void binarySearch(int[] a, int number) {
			int start = 0;
			int end = a.length - 1;
			boolean result = false;
			int index = 0;

			while (start <= end) {
				int mid = (start + end) / 2;
				if (number == a[mid]) {
					result = true;
					index = mid;
					break;
				} else if (number < a[mid])
					end = mid - 1;
				else
					start = mid + 1;
			}

			if (result == true)
				System.out.println("Number is present at index " + index);
			else
				System.out.println("Number Not Found");

		}
	}


	


				

					

	





