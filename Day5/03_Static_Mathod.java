import java.util.*;
class MathOpe{
    static int a=10;
   static int sum (int i , int j){
       return i+j;
   }
   static void show (int res){
       System.out.println(res);
   }

}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = MathOpe.sum(11,22);
        MathOpe.show(s);
        System.out.println(MathOpe.a);
        
     
    }
}