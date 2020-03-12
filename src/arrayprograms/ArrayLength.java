package arrayprograms;

//Program 2: Find the length of an Array or String without using length or length() function.

public class ArrayLength {

	public static void main(String[] args) {
				
				
				int n[] = { 5, 7, 8, 9, 10, 9, 12 };
				lengthArray(n);
			}

			
			public static void lengthArray(int[] a) {
				
				int i = 0;
				try {
				while(true)
		        {	
		            int temp = a[i];
		            i++;
		        }
					
				} catch (Exception e) {
					System.out.println("The Length of array is " + i);
				}

			}
}


