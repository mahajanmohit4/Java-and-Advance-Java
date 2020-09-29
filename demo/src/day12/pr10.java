package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class pr10 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(1);
		a.add(2);
		
		
		System.out.println(sum(a));

	}
	static int sum(ArrayList<Integer> nn) {
		int s = 0;
		for(Integer i : nn) {
//			Integer j = (Integer)i;
			s+=i;
		}
		return s;
	}


}
