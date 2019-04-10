package otherprograms;

public class CommonElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 5, 6, 7, 8, 9, 10, 12 };
		int[] b = { 1, 2, 3, 6, 12 };
		String a1[] = { "R", "O", "H", "I", "T", "B", "H" };
		String a2[] = { "M", "B", "H", "Y", "T" };
		commonElement(a, b);
		commonElement(a1, a2);

	}

	public static void commonElement(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])
					System.out.println(a[i]);
			}
		}

	}

	public static void commonElement(String[] a, String[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])
					System.out.println(a[i]);
			}
		}

	}

}
