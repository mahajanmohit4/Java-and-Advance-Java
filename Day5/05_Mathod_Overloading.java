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
   static void sum(int i, float j , int m){
    //    int k = i+j+m;
    int k= i+m;
       System.out.println(k);
   }


}

class Main{
    public static void main(String[] args){
       
         MathOpe.sum(11,22);
       MathOpe.sum(11,22,33);
       MathOpe.sum(11,22.11F,33);
        
     
    }
}