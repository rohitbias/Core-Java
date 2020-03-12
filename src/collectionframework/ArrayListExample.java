package collectionframework;
import java.util.ArrayList;
import java.util.Iterator;

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
