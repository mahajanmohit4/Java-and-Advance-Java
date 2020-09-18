import java.util.*;
class Calculator{
    int num1;
    int num2;
    int result;

    void add(int n1 , int n2){
        this.num1 = n1;
        this.num2 = n2;

        int result = num1+num2;
        System.out.println("Addition is :  " + result);
    }
     void sub(int n1 , int n2){
        this.num1 = n1;
        this.num2 = n2;

        int result = num1-num2;
        System.out.println("Addition is :  " + result);
    }
     void multi(int n1 , int n2){
        this.num1 = n1;
        this.num2 = n2;

        int result = num1*num2;
        System.out.println("Addition is :  " + result);
    }
     void div(int n1 , int n2){
        this.num1 = n1;
        this.num2 = n2;

        int result = num1/num2;
        System.out.println("Addition is :  " + result);
    }
};

class Main{
    public static void main(String[] agrs){
        Calculator obj = new Calculator();
        // obj.add(10,20);

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Additon 2. Substraction 3. Multiplication 4. Division");
        System.out.print("Enter your choice : ");
        byte ch = sc.nextByte();
          System.out.println("Enter the two number : ");
                int a = sc.nextInt();
                int b = sc.nextInt();
        switch(ch){
           
            case 1 :

                obj.add(a,b);
                break;
            case 2 :

                obj.sub(a,b);
                break;
            case 3 :

                obj.multi(a,b);
                break;
            case 4 :
                obj.div(a,b);
                break;
            default  :
                System.out.println("you entered wrong !!");
                // break;
        }
        
    }
}