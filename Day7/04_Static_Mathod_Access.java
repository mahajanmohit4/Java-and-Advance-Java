class Foo{
    static void m1(){
        System.out.println("Foo m1");
    }
    static void m2(){
        System.out.println("Foo m2");
    }
   
}

class Main{
    public static void main(String[] args){
        System.out.println("");
        Foo.m1();
        new Foo().m2();
    }
}