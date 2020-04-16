package collectionframework;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();

		stack.push("1");
		stack.push("2");
		stack.pop();
		stack.push("3");

		Iterator iterator = stack.iterator();
		while(iterator.hasNext()){
		    System.out.println(iterator.next());
		}
		
	}
}


