import java.util.*;
class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the char . :");
            char ch = sc.next().charAt(0);
       switch(ch)
       {
           case 'a':
         
            case 'e':
           
            case 'o':
          
            case 'u':
                    System.out.println("ch is vowel (Lower)");
                    break;

           case 'A':
         
            case 'E':
           
            case 'I':
          
            case 'O':

             case 'U':
                    System.out.println("ch is vowel (Capital)");
                     break;
    
          
           default :
                System.out.println("ch is not vowel .");
       }
         
    }
}