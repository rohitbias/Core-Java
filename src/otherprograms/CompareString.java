package otherprograms;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String a = "r";
			String b = "r";
			
			if (a.compareTo(b) > 1)
				System.out.println("String " + a + " is greater than " + b);
			else if (a.compareTo(b) < 1)
				System.out.println("String " + b + " is greater than " + a);
			else
				System.out.println("Both String are Equals");

		}

	}
}