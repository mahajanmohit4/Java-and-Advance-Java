import java.util.*;
class Main{
    public static void main(String args[]){
        System.out.print("Enter the numbere : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        for (int i=1 ; i<=10;i++){
            int number=no*i;
            System.out.println(number);
        }
    }
}