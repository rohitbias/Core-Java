package otherprograms;

import java.util.Scanner;

public class KLargestElement {
	
	public static void main(String[] args) {
		
		int[] a={1,10,15,77,37,4,21};
		Scanner s= new Scanner(System.in);
		int temp=0;
		System.out.println("Which largest Element you want:" );
		int s1=s.nextInt();
		for(int i=0; i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
			if(a[i]<a[j]) //descending sort
				temp=a[i];
				a[i]=a[j];
				a[j]=a[i];
			
		}
		}
		System.out.println("The"+s1+ "largest element is "+ a[s1-1]);
		s.close();
		
	}

}
