package otherprograms;

public class ConsecutiveCounts {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 };
		int count = 0;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1)
				count++;
			if (count > temp)
				temp = count;
			else
				count = 0;
		}
		System.out.println(temp);
	}

}
