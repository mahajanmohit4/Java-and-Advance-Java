package day11;

import java.util.Scanner;

public class Pr01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day no ");
		byte dayNo = sc.nextByte();
		if(dayNo >= 1 && dayNo <= 7) {
			System.out.println("ok");
		}else {
			throw new ArithmeticException();
		}
	}

}
