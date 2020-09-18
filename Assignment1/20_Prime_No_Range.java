import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =5;
        byte flag =1;
        int b=10;
    for ( int j = n ; j<=b ; j++ )
    {
        for (int i =2 ; i<n ;i++){
            if(j%i == 0){
                flag = 0;
                break;
            }
            flag=1;
        }
          if(flag == 1) System.out.println(j);
          
    }
        
      
    }
}