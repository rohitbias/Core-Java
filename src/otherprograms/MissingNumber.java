package otherprograms;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,8,9,10};
		int n=10;
		int sum=0;
		int total=(n*(n+1))/2;
		int length=a.length;
		for(int i=0;i<length;i++)
		{
		sum=sum+a[i];
		}
		System.out.println("The missing number in array is "+ (total-sum));
		

	}
}

