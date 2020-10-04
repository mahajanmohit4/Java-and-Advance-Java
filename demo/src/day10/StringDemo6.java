package day10;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("mohit");
		System.out.println(s);
		s.append("as");
		System.out.println(s);
		s.insert(3, "ABC");
		System.out.println(s);
		s.replace(2,5,"AFG");
		System.out.println(s);
		s.delete(4, 7);
		System.out.println(s);
	}

}
