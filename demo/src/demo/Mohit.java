package demo;
interface Hello{
    int show(int number1 , int number2);
}
class World {
    static  void show(int a , int b , Hello ref){

        int add = ref.show(a,b);
        System.out.println("show mathod "+add);
    }
}
public class Mohit {
	public static void main(String[] arg) {
		   World.show(1 , 2, (int a , int b ) -> {
	            return a+b;});
	}

}

