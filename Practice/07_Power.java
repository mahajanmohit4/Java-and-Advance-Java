import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = sc.nextInt(); // give input 2
        System.out.print("Enter the Number of Power : ");
        int b = sc.nextInt(); // give input 6
        int sum=1;
        int i;
        for(i=0 ;i<b;i++) sum = sum*a;
        System.out.println(sum);
    }
}