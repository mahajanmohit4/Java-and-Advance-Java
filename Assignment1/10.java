import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the temp in Fahrenheit : ");
        int f = scan.nextInt();
        int C= 5*(f-32)/9 ;
        System.out.println("Temp in Cencius : " + C);
    }
}