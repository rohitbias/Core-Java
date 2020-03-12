package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("a");
		list.add("e");
		list.add("i");
		list.add("o");
		list.add("u");
		list.add("b");
		list.add("c");
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
