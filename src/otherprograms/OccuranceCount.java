package otherprograms;

import java.util.HashMap;
import java.util.Scanner;

public class OccuranceCount {
	
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		String a= s.nextLine();
		char[] strArray=a.toCharArray();
		
		HashMap <Character,Integer> charCountMap= new HashMap<Character,Integer>();
		for(char c: strArray)
		{
		if(charCountMap.containsKey(c))	
			 //If char is present in charCountMap, incrementing it's count by 1
			charCountMap.put(c, charCountMap.get(c)+1);
		else
			//If char is not present in charCountMap, putting this char to charCountMap with 1 as it's value.
			charCountMap.put(c, 1);
		}
		System.out.println(charCountMap);
		s.close();
	}
	
}

