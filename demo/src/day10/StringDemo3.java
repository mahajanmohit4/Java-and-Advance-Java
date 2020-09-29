package day10;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a content";
		String ar[] = s.split(" ");
		for(String a : ar)
			System.out.println(a);
		
		System.out.println("-------");
		String s1 = String.join(" : ",ar);
		System.out.println(s1);
	}

}
