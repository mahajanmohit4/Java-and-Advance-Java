import java.util.*;
class Main{
    public static void main(String args[]){
        System.out.print("Enter the numbere : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        byte flag = 1;
        if(no <= 1){
            flag=0;
        }
        for (int i=2; i<no ;i++){
            if(no%i == 0){               
                flag=0;
                break;
            }
        }

        if(flag==1) System.out.println("Number is Prime number ");
        else        System.out.println("Number is not Prime Number");        
    }
}