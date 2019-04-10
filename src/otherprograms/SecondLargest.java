package otherprograms;

public class SecondLargest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,6,13,7,19,25,99,0,1,12};
		int largest=0;
		int secondlargest=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
				{
				secondlargest=largest;
				largest=a[i];
				}
			else if (a[i] > secondlargest) {
				secondlargest = a[i];
		}
		
		
	}
		System.out.println("Largest is :"+largest + "\nSecond Largest is :"+secondlargest );
}
}
