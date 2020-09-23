class Foo{
    static void m1(){
        System.out.println("Foo m1");
    }
   
}
class Bar extends Foo{
    static void m1(){
        System.out.println("Bar m1");
    }
    static void m2(){
        // System.out.println("");
        m1();
    }
}
class Main{
    public static void main(String[] args){
        System.out.println("");
        // Foo.m1();
        // Bar.m1();
        Foo f = new Bar();
        f.m1();
        Bar f1 = new Bar();  //
        // f1.m1();
        f1.m2();
    }
}