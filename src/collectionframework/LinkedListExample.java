package collectionframework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("e");
		list.add("i");
		list.add("o");
		list.add("u");
		list.add("b");
		list.add("c");
		System.out.println(list);

		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}