import java.util.*;
abstract class Shape{
    float ar;
    abstract void area();
    void show(){ //Concrete Methods ... 
        System.out.println("Area : "+ar);
    }
}
class Ractangle extends Shape{ //Concrete Class
    void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter len");
        float len = sc.nextFloat();
        System.out.println("Enter br");
        float br = sc.nextFloat();
        ar = len * br;
    }
}
class Main{
    public static void main(String[] args){
       System.out.println("");
       Scanner sc = new Scanner(System.in);
    //    Ractangle r = new Ractangle();
        Shape r = new Ractangle();
       r.area();
       r.show();
    }
}