package day11;

public class Pr08_Var_Arg {
	static void show(int... ar) {
		System.out.println("Called for :");
		for(int a : ar) {
			System.out.print(" "+a);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		show();
		show(12);
		show(1,2,3);
		int arr[] = {1,2,3,4,5};
		show(arr);
	}
	
	
	
}
