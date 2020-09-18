import java.util.*;
class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic Selery : ");
        int basic_sal = sc.nextInt();
        double hra ,  da;
        if (basic_sal < 10000){
            hra = (10*basic_sal)/100D;
            da = (90*basic_sal)/100D;
        }else{
            hra = 2000F;
            da = (98*basic_sal)/100D;
        }
        double gs = basic_sal+hra+da;
        System.out.println("hra : " +hra+ " da : " +da);
        System.out.println("Gross Salary is : " +gs);


    }
}