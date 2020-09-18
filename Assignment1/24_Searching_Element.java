import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i =0 ; i<arr.length ; i++){
            System.out.print("Enter the Number "+i+ " : ");
            arr[i] = sc.nextInt();
        }
        int flag ;
        flag = 1;

        System.out.print("Enter Number for Find : ");
        int no = sc.nextInt();
        for(int j=0 ; j<arr.length ; j++){
            if(arr[j] == no){
                flag=j;
                break;
            }
        }

        if (flag == 1) System.out.println("Number is Not found !!");
        else System.out.println("Number is found at Index "+flag+" : "+no ) ;
  
    }   
}
