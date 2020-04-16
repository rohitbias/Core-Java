package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		ArrayList<String> l = new ArrayList<String>();
		List l2 = (LinkedList)list.clone();
		
		List l3 = new ArrayList<String>(list);
		
		list.add("a");
		list.add("e");
		list.add("i");
		list.add("o");
		list.add("u");
		list.add("b");
		list.add("c");
		
		list.addFirst("1");
		list.addLast("2");
		//list.remove(1);
		list.set(2, "p");// will replace the object at particular index.
		list.remove("z");
		l.add("a");
		l.add("b");
		list.add(null);
		list.add("v");
		list.addAll(l);
		

		
		System.out.println(list);
		
		Collections.swap(list, 1, 3);
		int mid=list.size()/2;
		list.add(mid, "hello");
		System.out.println(list);
		
		
//		//list.removeLast();
//		list.removeLastOccurrence("r");
//		//list.removeFirstOccurrence("a");
//		System.out.println(list);

		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}