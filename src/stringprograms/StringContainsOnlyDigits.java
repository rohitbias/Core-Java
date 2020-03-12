package stringprograms;

public class StringContainsOnlyDigits {

	public static void main(String[] args) {
		
		String str = "5demo9";
		System.out.println(verifyString(str));
	}

	public static boolean verifyString(String str) {
		
		
    boolean flag=false;
	if(str.matches("[0-9]+") == false && str.length() > 2){
		flag=true;}
			
	return flag;

	}
}