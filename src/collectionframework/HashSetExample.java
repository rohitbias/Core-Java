package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("e");
		set.add("i");
		set.add("o");
		set.add("u");
		set.add("a");
		set.add("e");
		System.out.println(set);

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
