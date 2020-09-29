package day10;

public class ExcDemo3 {
	public static void main(String[] args) {
		System.out.println("started");
		try {
			String arr[] = {"11","10"};
			String s1 = arr[0];
			String s2 = arr[1];
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
			
			int k = i/j;
			System.out.println(k);
		}catch(Exception e) {
			System.out.println("can not divide by zero");
		}
		
		System.out.println("finish");
	}
}
