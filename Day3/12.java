import java.util.*;
class Main{
    public static void main(String args[]){
      
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        int c[] = {7,8,9};

        int arr[][] = new int[3][];

        arr[0] =a ;
        arr[1] =b;
        arr[2] =c;

        for (int i=0; i<arr.length ; i++){
            for (int j=0; j<arr[i].length ; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
     System.out.println("For each loop ");
      for (int i[] : arr){
          for(int j : i)
                System.out.print(" "+j);
            System.out.println("");
      }
         
    }
}