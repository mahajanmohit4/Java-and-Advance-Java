class Outer{
     class Foo{
        void m1(){
            System.out.println("Non Static class");
        }
    }
}

class Main{
    public static void main(String[] args){
        System.out.println("");
        Outer obj = new Outer();
        Outer.Foo ref = obj.new Foo();
        ref.m1();

       
    }
}