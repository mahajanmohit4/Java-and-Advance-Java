interface Foo{
    void m1();

}
class Bar implements Foo{
    public void m1(){
        System.out.println("From functional interface !!");
    }
}
class Main{
    public static void main(String[] args){
        System.out.println("");
        // Foo.m1();
        Bar b = new Bar();
        b.m1();
    }
}