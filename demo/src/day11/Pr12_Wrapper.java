package day11;

public class Pr12_Wrapper {
	public static void main(String[] args) {
		int i=10;
		Integer r = new Integer(i); //boxing
		System.out.println(r);
		Integer r1 = Integer.valueOf(i); //boxing
		System.out.println(r1);
		
		Integer r2 = 456;  	//auto boxing
		System.out.println(r2);
		
		//-------- unboxing------------
		
	}
}
