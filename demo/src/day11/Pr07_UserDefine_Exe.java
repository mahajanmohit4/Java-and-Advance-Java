package day11;

import java.util.Scanner;

class SalaryException extends Exception{
	public SalaryException() {
		super("What !! this is a salary");
		// TODO Auto-generated constructor stub
	}
}
public class Pr07_UserDefine_Exe {
	static void salary(float sal) throws SalaryException{
		if(sal>10000) {
			System.out.println("sal = " +sal);
		}else {
			throw new SalaryException();
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary : ");
		float s = sc.nextFloat();
		try {
			salary(s);
		}catch(SalaryException e ) {
			System.out.println(e);
		}
	}
}
