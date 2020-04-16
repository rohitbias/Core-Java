package collectionframework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String args[]){  
	  LinkedHashSet<String> set=new LinkedHashSet();  
      
	  set.add("Rohit");    
      set.add("Rahul");    
      set.add("Mayank");   
      set.add("Bhanu");  
      set.add("PINGU"); 
      
      Iterator<String> itr=set.iterator();  
      while(itr.hasNext())  
      {  
      System.out.println(itr.next());  
      }  
}  
}
