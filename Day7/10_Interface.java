import java.util.*;
interface Drawable{
    //final float PI = 3.14;
    int a = 100;
    // public static final int a =100;
    //   void draw();
    public abstract void draw();
}
abstract class Shape{
    float ar;
    abstract void area();
    void show(){ //Concrete Methods ... 
        System.out.println("Area : "+ar);
    }
}
class Ractangle extends Shape implements Drawable{ //Concrete Class
    void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter len");
        float len = sc.nextFloat();
        System.out.println("Enter br");
        float br = sc.nextFloat();
        ar = len * br;
        
    }
    public void draw(){
            System.out.println("draw");
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