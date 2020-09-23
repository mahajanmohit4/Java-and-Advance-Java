

class Main{
    static void m1(){
        System.out.println("Foo m1");
    }
     void m2(){
        System.out.println("Foo m2");
    }
   
    public static void main(String[] args){
        System.out.println("");
        Main.m1();
        new Main().m2();
        m1();
        //m2(); //=> Compile Time Error
    }
}