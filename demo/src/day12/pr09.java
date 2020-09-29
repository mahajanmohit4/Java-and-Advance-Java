package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class pr09 {
	public static void main(String[] args) {

		List a = new ArrayList();
		a.add(123);
		a.add("Mohit");
		a.add(12.12);
		a.add("Deepak");
		System.out.println(a);
		Object obj = a.get(1);
		System.out.println(obj);
		
		for(int i=0 ; i<a.size() ; i++) {
			System.out.println(a.get(i));
		}
		

	}


}
