package day11;

class MyGen11<T,P>{
	T t;
	P p;
	MyGen11(T t , P p){
		this.t = t;
		this.p = p;
	}
	void show() {
		System.out.println(t+" "+p);
		
	}
}
public class Pr15_Generic2 {
	public static void main(String[] args) {
		MyGen11<Integer,String> i = new MyGen11<Integer,String>(1, "mohit");
		i.show();
		
	}
}


