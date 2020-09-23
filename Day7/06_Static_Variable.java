

class Main{
    int i = 100;
    static int j = 200;
    static void m1(){
        System.out.println("Foo m1");
    }
    void m2(){
        System.out.println("Foo m2");
    }
    void  m3(){
        System.out.println(i);
        System.out.println(j);
       m1();
    //    m2();
   }
    public static void main(String[] args){
        System.out.println("");
        // System.out.println(i);
        System.out.println(j);
        new Main().m3();
       
    }
}