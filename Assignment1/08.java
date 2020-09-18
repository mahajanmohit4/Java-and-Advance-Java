import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Priciple , Rate , Time : ");
        int p = scan.nextInt();
        int r = scan.nextInt();
        int t = scan.nextInt();

        double i ;
        i=(p*r*t)/100;

        System.out.println("Intrest : " + i);
    }
}