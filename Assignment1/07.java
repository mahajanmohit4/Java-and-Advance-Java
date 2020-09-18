import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the 5 Subject Marks : ");
       int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();
       int d = scan.nextInt();
       int e = scan.nextInt();

       double per;

       int sum = a+b+c+d+e;
       per = (sum)/5;
       System.out.println("Percentage is : " + per + "%");
    }
}