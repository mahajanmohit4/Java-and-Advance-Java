package demo;

@FunctionalInterface
interface MyPredicator{
	int ope(int i , int j);
}

public class lemda {
	public static void main(String[] args) {
		MyPredicator m = (i,j) -> i+j;
		System.out.println(m.ope(10,20));
	}
	
}
