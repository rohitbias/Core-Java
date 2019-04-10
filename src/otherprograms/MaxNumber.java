package otherprograms;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 6, 13, 7, 19, 25, 99, 0, 1, 12 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Max is :" + max);
	}

}
