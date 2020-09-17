import java.util.Scanner;
class CmdArgs{
    public static void main(String[] args){
        
        String s1 = args[0];
        String s2 = args[1];
        System.out.println(s1); 
       //run-> java CmdArgs mohit 
    //    java CmdArgs "mohit mahajan"
        // Scanner sc = new Scanner(System.in); // constructor call
        // System.out.println("Enter ur Name : ");

        // String name = sc.next();
        // System.out.println("welcone : "  + name);
    }
}