import java.util.Scanner;
class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // constructor call
        System.out.println("Enter Number : ");

        int num = sc.nextInt();
        double no = num%2 ;
        if( no == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        // System.out.println("welcone : "  + name);
    }
}