package inheritanceconcept;

class grandfather{
	public static  String Fname="Bikas";
	public static void main(String args[])
	{
		System.out.println(Fname+"abc");
	
}

public class Father extends grandfather{
	
	void NewMethod()
	{
		String Fname="Ramesh";
		System.out.println(Fname);
		System.out.println(super.Fname);
	}

}}


 