package day12;

import java.sql.Array;
import java.util.ArrayList;
//import java.util.List;

public class pr08 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(3);
		a.add(1);
		a.add(2);
		
		
		System.out.println(sum(a));

	}
	static int sum(ArrayList nn) {
		int s = 0;
		for(Object i : nn) {
			Integer j = (Integer)i;
			s+=j;
		}
		return s;
	}


}
