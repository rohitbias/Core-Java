package otherprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		int number=s.nextInt();
		int reverse=0;
		int remainder;
		while(number!=0)
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println(reverse);
		s.close();
	}

}


