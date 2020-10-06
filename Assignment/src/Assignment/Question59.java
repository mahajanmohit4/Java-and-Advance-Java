package Assignment;

import java.util.Scanner;

class Voter extends Exception{
	 String voterId;
	 int age;
	 public Voter(){
		 super("Age is Not Valid !!");
	 }
	 public Voter(String voterId , int age){
		 this.voterId = voterId;
		 this.age = age;		 
	 }
	 
}

public class Question59 {
	static void ageCheck(int age) throws Voter{
		if(age>18) {
			System.out.println("age is valid : " +age);
		}else {
			throw new Voter();
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter age : ");
		int age = sc.nextInt();
		System.out.print("Enter voterId : ");
		String voterId = sc.next();
		try {
			ageCheck(age);
		}catch(Voter e ) {
			System.out.println(e);
		}
	}
}

