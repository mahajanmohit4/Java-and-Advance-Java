import java.util.*;
class Staic{
    String ename;
    int eid;
    static int ceo;

//    static {
//        System.out.print("Enter the CEO");
//        Scanner scan1 = new Scanner(System.in);
//        ceo = scan1.nextInt();
//    }

    public Staic(){
        System.out.print("Enteer the name : ");
        Scanner scan = new Scanner(System.in);
        ename = scan.nextLine();
        eid = scan.nextInt();
        System.out.print(ename + "  " + eid);
    }
}
 class Main{
    static int i = 2;
    public static void main(String[] agrs)
    {
        for (int ii = 0 ; ii < i ; ii++ )
        {
            Staic obj = new Staic();

        }
    }

}
