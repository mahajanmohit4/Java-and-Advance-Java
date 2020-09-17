import java.util.Scanner;
class Add{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // constructor call
    //   Scanner sc = new Scanner("123 321"); // constructor call

        System.out.println("Enter number A & B : ");


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum : "  + c);
    }
}