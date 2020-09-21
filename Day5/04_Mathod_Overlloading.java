import java.util.*;
class MathOpe{
   static void sum(int i, int j){
       int k = i+j;
       System.out.println(k);
   }
   static void sum(int i, int j , int p){
       int k = i+j+p;
       System.out.println(k);
   }


}

class Main{
    public static void main(String[] args){
       
         MathOpe.sum(11,22);
       MathOpe.sum(11,22,33);
        
     
    }
}