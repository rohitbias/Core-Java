package otherprograms;

import java.util.Scanner;

public class RemoveCharInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		String a= s.nextLine();
		System.out.println("The Char String is :" + removeNumber(a));
		System.out.println("The Numeric String is :" + removeChar(a));
		s.close();
		
	}

	public static String removeChar(String input)
	{
		String x=input.replaceAll("[A-Za-z]", ""); 
		return x;
	}
	
	public static String removeNumber(String input)
	{
		String x=input.replaceAll("[0-9]", ""); 
		return x;
	}	

	}

