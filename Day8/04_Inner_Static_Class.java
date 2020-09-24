class Outer{
    static class Foo{
        void m1(){
            System.out.println("Static class");
        }
    }
}

class Main{
    public static void main(String[] args){
        System.out.println("");
        Outer.Foo ref = new Outer.Foo();
        ref.m1();

       
    }
}