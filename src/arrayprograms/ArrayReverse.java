package arrayprograms;

public class ArrayReverse {
	public static void main(String args[]) {
	 
	 int[] a= {1,2,3};
	 
	 int b[]=reverseArray(a,a.length);
	 
	 for(int x:b)//enhanced for loop
	 {
		 System.out.print(x);
	 }
	 
}	
	public static int[] reverseArray(int a[],int n)
	{
		
		int b []= new int[n];
		int j=n;
		
		for(int i=0;i<n;i++)
		{
			b[i]=a[j-1];
			j--;
			
		}
		return b;
		
	}
	
}
