package collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String args[]) {
	
	//Creating and adding elements  
	  TreeSet<String> al=new TreeSet<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  //Traversing elements  
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	} 

