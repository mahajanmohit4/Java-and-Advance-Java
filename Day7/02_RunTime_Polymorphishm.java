class Foo{
    void m1(){
        System.out.println("First m1");
    }
    void m1(int i){
        System.out.println("Scond m1");
    }
}
class Bar extends Foo{
    void m1(){
        System.out.println("Bar m1");
    }
}
class Main{
    public static void main(String[] args){
        System.out.println("");
        Foo f = new Bar();
        f.m1();
        // f.m1(123);
    }
}