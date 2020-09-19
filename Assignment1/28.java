import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];

        for (int i=0; i<arr.length ; i++){
            System.out.print("Enter the Name of city : ");
            arr[i] = sc.nextLine();
        }

        for(String j : arr){
            System.out.println(" "+j);
        }

    } 
}