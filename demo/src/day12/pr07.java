package day12;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class pr07 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(123);
		a.add("Mohit");
		a.add(12.12);
		a.add("Deepak");
		System.out.println(a);
		
		ListIterator it = a.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
//			it.remove();
		}
		while(it.hasNext()) {
			System.out.println(it.previous());
//			it.remove();
		}

	}

}
