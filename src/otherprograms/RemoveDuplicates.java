package otherprograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,6,13,7,12,5,7,19,25,99,0,1,12};
		int n=a.length;
		removeDuplicates(a);
		removeDuplicates(a,n);
	}
	public static void removeDuplicates(int a[])
	{
	Set set = new HashSet<Integer>();
	
	for (int num : a) {
	    set.add(num);
	}
	System.out.println("Duplicates through Set Method");
	System.out.println(set);
}
	
	public static void removeDuplicates(int arr[], int n)
	{
		//int temp[n];
	    // Return, if array is empty
	    // or contains a single element
	    if (n==0 || n==1)
	        System.out.println("There is only 1 or 0 elements in array");
	 
	    
	 
	    // Start traversing elements
	    int j = 0;
	    int[] temp = null;
		for (int i=0; i<n-1; i++)
	 
	        // If current element is not equal
	        // to next element then store that
	        // current element
	        if (arr[i] != arr[i+1])
	            temp[j++] = arr[i];
	 
	    // Store the last element as whether
	    // it is unique or repeated, it hasn't
	    // stored previously
	    temp[j++] = arr[n-1];
	 
	    // Modify original array
	    for (int i=0; i<j; i++)
	        arr[i] = temp[i];
	 
	    System.out.println(j);
	}
}
