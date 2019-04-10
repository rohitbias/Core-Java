package recursionprograms;

//Recursion: is were one method is called inside of itself in order to produce a desired output.  

public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0;
		while (index < 10)//first 10 number of fibonacii series.
		// while(true)
		{
			System.out.println(fibonacii(index));
			index++;
		}

	}

	public static long fibonacii(int i) {
		if (i == 0)
			return 0;
		if (i <= 2)
			return 1;
		long fibonac = fibonacii(i - 1) + fibonacii(i - 2);
		return fibonac;
	}

}
