import java.util.Scanner;
// import java.lang.Math.max(); 
import java.lang.*; 
class First{
    public static void main(String[] args){
        System.out.println("hello");
        int a=11;
        System.out.println("Enter the number ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();

        System.out.println("aa : " + a + " bb " + b);

        System.out.println(Math.max(a,b));
    }
}