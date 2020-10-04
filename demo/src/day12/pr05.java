package day12;

import java.util.ArrayList;
import java.util.Collection;

public class pr05 {

	public static void main(String[] args) {
		
		Collection a = new ArrayList();
		a.add(123);
		a.add("Mohit");
		a.add(12.12);
		a.add("Deepak");
		System.out.println(a);
		
		for(Object i : a) {
			 System.out.println(i);
		}

		
	}

}
