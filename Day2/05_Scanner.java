import java.util.Scanner;
class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // constructor call
        System.out.println("Enter ur Name : ");

        String name = sc.next();
        System.out.println("welcone : "  + name);
    }
}