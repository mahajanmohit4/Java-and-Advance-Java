import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Many Number of array do You want : ");
        int no = sc.nextInt();
        int arr[] = new int[no];
        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Enter the Number : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Smallest NUmber is : "+arr[0]);
        System.out.println("Greatest Number is : "+arr[no-1]);
    }
}