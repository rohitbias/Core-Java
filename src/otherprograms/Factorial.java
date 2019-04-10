package otherprograms;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number for factorial: ");
	int number=s.nextInt();
	int fact=1;
	while(number!=0)
	{
		fact=fact*number;
		number--;
	}
	System.out.println("The Factorial is :"+fact);
	s.close();
}
}
