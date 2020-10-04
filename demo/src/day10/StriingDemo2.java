package day10;

import java.util.Scanner;

public class StriingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur name : ");
		String uname = sc.next();
		System.out.println("Enter ur password : ");
		String upass = sc.next();
		if(uname.equalsIgnoreCase("Mohit") && upass.equals("asdf")) {
			System.out.println("welcome");
		}
		else {
			System.out.println("try again");
		}
	}

}
