import java.util.*;
class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       

        if(a>b && a>c ){
            System.out.println("A is Highest number !!");
        }else if(b>c){
            System.out.println("B is Highest number !!");
        }
        else{
             System.out.println("C is Highest number !!");
        }
        
        String res = (a>b && a>c) ? "A is Highest number !!" : (b>c) ? "B is Highest number !!" : "C is Highest number !!";
        System.out.println(res);
    }
}