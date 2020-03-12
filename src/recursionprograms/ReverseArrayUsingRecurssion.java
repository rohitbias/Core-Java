package recursionprograms;

public class ReverseArrayUsingRecurssion {
	public static void main(String args[]) {

		int[] a = { 1, 2, 3, 4, 5 };
		int start = 0;
		int end = a.length - 1;

		int b[] = reverseArray(a, start, end);

		for (int x : b)// enhanced for loop
		{
			System.out.print(x);
		}

	}

	public static int[] reverseArray(int array[], int start, int end) {
		
		int temp;
		if(start>=end) //Termination Condition
    	return array;
    
       temp=array[start];
       array[start]=array[end];
       array[end]=temp;
    
		return reverseArray(array,start+1,end-1);
	}

}
