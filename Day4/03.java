import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row in Array : ");
        int row = sc.nextInt();
        int arr[][] = new int[row][];
       
        for (int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print("Enter the number "+i+" , "+j+" : ");
                arr[i][j] = sc.nextInt();
                
            }
        }
      for(int l[] : arr){
            for(int m : l){
                System.out.print(" "+m);
            }
            System.out.println("");
        }

    }
}