package day10;

public class EcxDemo2 {
	public static void main(String[] args) {
		System.out.println("started");
		try {
			String arr[] = {"11","0"};
			String s1 = arr[0];
			String s2 = arr[11];
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
			
			int k = i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("can not divide by zero");
		}catch(NumberFormatException e) {
			System.out.println("give num only");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array !!");
		}
		
		System.out.println("finish");
	}
}
