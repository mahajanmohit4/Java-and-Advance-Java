package day11;

import java.io.IOException;

class A{
	void m1() throws IOException{
		System.out.println("m1 A");
		throw new IOException();
	}
}
class B extends  A{
	void m1() throws IOException {
		System.out.println("m1 B");
	}
}
public class Pr08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
