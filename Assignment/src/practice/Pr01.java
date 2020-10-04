package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.*;
public class Pr01 {

	public static void main(String[] args) {
//		int values[] = new int[5];
//		Object values1[] = new Object[4];
//		values1[0] = "Mohit";
//		values[1] = 7;
//		System.out.println(values1[0]);
//		System.out.println(values1[1]);

		Collection values = new ArrayList();
		values.add(3);
		values.add("Mohit");
		values.add(22.2f);
		
		Iterator i = values.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(Object j : values) {
			System.out.println(j);
		}
		
		Collection<Integer> values1 = new ArrayList<Integer>();
		values1.add(11);
		values1.add(22);
		values1.remove(11);
		
		for(int k : values1) {
			System.out.println(k);
		}
	}

}
