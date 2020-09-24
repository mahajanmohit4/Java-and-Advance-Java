interface Foo{
    default void m1(){
         System.out.println("Default Interface Mathod");
    }

}
class Bar implements Foo{

}
class Main{
    public static void main(String[] args){
        System.out.println("");
        // Foo.m1();
        Bar b = new Bar();
        b.m1();
    }
}