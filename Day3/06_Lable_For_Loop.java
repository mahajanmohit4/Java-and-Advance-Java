import java.util.*;
class Main{
    public static void main(String args[]){
        outer:
         for(int i=1; i<=5; i++){
             Undar_Ka_For_Loop:
             for(int j=1;j<=5;j++){
                      System.out.print(" "+j);
                      if (j==3){ break outer; } 
             }
           
            
             System.out.println("");
         }
    }
}