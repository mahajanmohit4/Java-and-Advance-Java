package day11;
class MyGen<T>{
	T t;
	void show(T t) {
		System.out.println(t);
	}
}
//class MyGen<T>{
//	T t;
//	MyGen(T t){
//		this.t = t;
//	}
//	void show(T t) {
//		System.out.println(t);
//	}
//}
public class Pr14_Generic {
	public static void main(String[] args) {
		MyGen<Integer> i = new MyGen<Integer>();
		i.show(123);
		MyGen<String> j = new MyGen<String>();
		j.show("Mohit");
	}
}
