package day12;

import java.util.ArrayList;
import java.util.Collection;

public class pr03 {


	public static void main(String[] args) {
		
		Collection a = new ArrayList();
		a.add(123);
		a.add("Mohit");
		a.add(12.12);
		System.out.println(a);
		
		Collection a1 = new ArrayList();
		a1.add(123);
		a1.add("Mohit");
		a1.add(12.12);
		System.out.println(a1);
		a.removeAll(a1); //removeAll comman element
		System.out.println(a);
	}


}
