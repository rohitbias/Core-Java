package arrayprograms;

public class ArraySum {

	public static void main(String[] args) {

		int[] number = { 5, 10, 15, 45 };
		System.out.println(sumArrayElements(number));

	}

	public static int sumArrayElements(int number[]) {

		int sum = 0;

		for (int n : number) {
			sum = sum + n;
		}
		return sum;

	}
}
