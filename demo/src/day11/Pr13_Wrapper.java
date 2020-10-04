package day11;

public class Pr13_Wrapper {
	public static void main(String[] args) {
		Integer r = new Integer(12);
		int i = r.intValue();
		
		System.out.println(i); 		//un-boxing
		
		int j = new Integer(56);	//auto-un-boxing
		System.out.println(j);
		
		Integer k = new Integer(33);
		Integer p = new Integer(67);
		Integer t = k+p; //autoboxing ->sum => Boxing
		System.out.println(t);
		
		int n1 = 10;
		int n2 = 20;
		int n = n1+n2;
		
		
		System.out.println(n);
		int nn = k+n1 ;
		System.out.println(nn);
	}
}
