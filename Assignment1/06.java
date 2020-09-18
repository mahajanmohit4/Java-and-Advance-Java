import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = scan.nextInt();
        float pi = 3.14F;
        float area;
        area = pi * r *r ;
        System.out.println("area is :  " + area);
    }
}