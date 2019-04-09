package recursionPrograms;

public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=0;
		while(true)
		{
			System.out.println(fibonacii(index));
			index++;
		}
		

	}

	public static long fibonacii(int i) {
		if (i==0)return 0;
		if (i<=2) return 1;
		long fibonac= fibonacii(i-1)+fibonacii(i-2);
		// TODO Auto-generated method stub
		return fibonac;
	}

}
