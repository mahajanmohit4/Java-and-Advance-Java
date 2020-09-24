class Outer{
    void m1(){
        class A{
            void m2(){
                System.out.println("Local Class");
            }
        }
        A obj = new A();
        obj.m2();
    }
     
}

class Main{
    public static void main(String[] args){
        System.out.println("");
        Outer obj = new Outer();
        obj.m1();
    }
}