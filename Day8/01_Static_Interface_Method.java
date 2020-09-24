interface Foo{
    static void m1(){
        System.out.println("Static Interface Mathod");
    }
}

class Main{
    public static void main(String[] args){
        System.out.println("");
        Foo.m1();
    }
}