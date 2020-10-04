package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class pr06 {

	public static void main(String[] args) {
		
		Collection a = new ArrayList();
		a.add(123);
		a.add("Mohit");
		a.add(12.12);
		a.add("Deepak");
		System.out.println(a);
		
		// traversing using Iterator
//		for(Object i : a) System.out.println(i);
		Iterator it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
//			it.remove();
		}
//		System.out.println(a.next());
		
//		System.out.println(a);
		
	}

}
