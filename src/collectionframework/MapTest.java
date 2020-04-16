package collectionframework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		Map<Integer, String> m= new HashMap<Integer,String>();
		m.put(1, "Rohit");
		m.put(2, "Rohit");
		m.put(3, "Rohit");
		m.put(4, "Rohit");
		m.put(1, "Mohit");
		m.put(5, "Rohit");
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		System.out.println(m.replace(1, "dad"));
		System.out.println(m.entrySet());
		System.out.println(m.containsKey(2));
		System.out.println(m.containsValue("ram"));
		
		
		Set s=m.entrySet();
		//Set k=m.keySet();
		//Collection v= m.values();
		//System.out.println(s);
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Entry m1=(Entry) itr.next();
			if(m1.getKey().equals(1))
				m1.setValue("prady");
			System.out.println(m1.getKey()+"-------------"+m1.getValue());
			//System.out.println(m1.getKey());
		}
		
		
		
		
	}

}
