import java.util.Scanner;
// import java.lang.Math.max(); 
import java.lang.*; 
class Second{
    public static void main(String[] args){
        System.out.println("Array : ");
        int[] arr = {1,2,3,4,5};
        arr = new int[5];
        Scanner scan = new Scanner(System.in);
        
        for (int i=0 ; i<5 ; i++){
             arr[i] = scan.nextInt();
            // System.out.println("array : " + arr[i]);
        }
        for (int i=0 ; i<5 ; i++){
            //  arr[i] = scan.nextInt();
            System.out.println("array : " + arr[i]);
        }

       


       
    }
}