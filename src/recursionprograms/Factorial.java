package recursionprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number for factorial: ");
		int number=s.nextInt();

		System.out.println("The Factorial through recurssive :" +fact(number));
		s.close();
				
				}
			
			//Factorial through recursion.
			public static int fact(int n)
		    {
				 if (n == 0)    
					    return 1;    
					  else    
					    return(n * fact(n-1));   
		    }
		}


