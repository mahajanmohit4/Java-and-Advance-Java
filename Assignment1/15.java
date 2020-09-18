import java.util.*;
class Main{
    public static void main(String args[]){
        System.out.println("Enter Gender and Age : ");
        Scanner sc = new Scanner(System.in);
        char g = sc.next().charAt(0);  
        int a = sc.nextInt();

        System.out.println("Gender : " +g+ " Age : " +a);

        // m>21 && f>18

        if (g == 'm' || g == 'M'  )
        {
                if (a>=21 ) System.out.println("valid to marrige !!");
                else System.out.println("not valid to marrige !!");
        }
        else if( g == 'f' || g == 'F')
        {
            if (a>=18 ) System.out.println("valid to marrige !!");
            else System.out.println("not valid to marrige !!");
        }

    }
}