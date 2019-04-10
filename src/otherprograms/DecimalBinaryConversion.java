package otherprograms;

import java.util.Scanner;

public class DecimalBinaryConversion {
	
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Decimal Number: ");
	int number=s.nextInt();
	String binary="";
	String result="";
	while(number>0)
	{
		int remainder=number%2;
		binary=binary+remainder;
		number=number/2;
	}
	for(int i=binary.length()-1;i>=0;i--)
	result=result+binary.charAt(i);
	System.out.println("The Binary number is :" +result);
	s.close();
}
}
