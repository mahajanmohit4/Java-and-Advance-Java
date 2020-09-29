package day11;

import java.io.IOException;

public class Pr06 {

	public static void main(String[] args) {
		try {
			m1();
		}catch(IOException e) {
			System.out.println("Exception Handlend");
		}
		
		
	}
	static void m1() throws IOException {
		m2();
	}
	static void m2() throws IOException{
		
//		System.out.println("Enter any char");
//		int j = System.in.read();
//		System.out.println("u entered "+(char)j);
		throw new IOException();
	}

}
