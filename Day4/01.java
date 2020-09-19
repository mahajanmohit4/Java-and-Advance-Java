import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int sum = 0;
        for (int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print("Enter the number "+i+" , "+j+" : ");
                arr[i][j] = sc.nextInt();
               
            }
        }
       
        for(int j[] : arr){
            for(int k : j){
                System.out.print(" "+k);
            }
            System.out.println("");
        }


    }
}