package stringprograms;

public class AnagramsString {
	
	void method()
	{
		StringBuffer s1=new StringBuffer("Java");
	    s1.replace(2, 3, "t");
		System.out.println(s1);
		
	}

	public static void main(String[] args) {
		AnagramsString t=new AnagramsString();
		t.method();

	}

}
