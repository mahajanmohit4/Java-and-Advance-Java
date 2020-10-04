package day11;

import java.io.IOException;

public class Pr03 {

	public static void main(String[] args) {
		
		m1();
		
	}
	static void m1() {
		m2();
	}
	static void m2() {
		
		System.out.println("Enter any char");
		try {
			int j = System.in.read();
			System.out.println("u entered "+(char)j);
		}catch(Exception e) {
			
		}
		
	}

}
