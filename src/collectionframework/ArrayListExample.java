package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* List is an Interface which allows collection of homogeneous object to which allows duplicate
 * and insertion order is preserved. The implementation classes of list are 
 * ArrayList
 * LinkedList
 * Vector
 * Stack
 **/

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		List list2 = new ArrayList();
		List l3 = new ArrayList();
		list.add("a");
		list.add("e");
		list.add("b");
		list.add("i");
		list.add("o");
		list.add("u");
		list.add("b");
		list.add("c");

		list2.add("a");
		list2.add("e");
		list2.add("m");
		list2.add("p");

		System.out.println(list);

		for (int i = list.size() - 1; i >= 0; i--) {
			l3.add(list.get(i));
		}
		System.out.println(l3);
		System.out.println(l3);
		System.out.println(list2);
		list.removeAll(list2);
		System.out.println(list);
		
		  list.addAll(list2); System.out.println(list); Set s= new HashSet();
		  s.addAll(list); System.out.println(s);
		  
		  System.out.println(list.retainAll(list2)); System.out.println(list);
		 

	}
}