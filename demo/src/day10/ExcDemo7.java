package day10;

public class ExcDemo7 {
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
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("can not divide by zero");
		}finally {
			System.out.println("Execute any how");
			System.out.println("close the resource !!");
		}
		
		System.out.println("finish");
	}
}
