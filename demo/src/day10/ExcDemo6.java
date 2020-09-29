package day10;

public class ExcDemo6 {
	public static void main(String[] args) {
		System.out.println("started");
		try {
			String arr[] = {"11","q10"};
			String s1 = arr[0];
			String s2 = arr[1];
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
			
			int k = i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("can not divide by zero");
		}catch(Exception e){
			System.out.println("");
		}
		finally {
			System.out.println("Execute any how");
		}
		
		System.out.println("finish");
	}
}
