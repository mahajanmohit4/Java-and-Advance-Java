import java.util.*;
class Main{
    public static void main(String args[]){
        System.out.print("Enter the numbere : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int rem;
        int sum = 0;
        while (no != 0){
            rem = no%10;
            sum = (sum *10) + rem;
            no = no/10;
        }
        System.out.println("reverse no is : " + sum);
    }
}