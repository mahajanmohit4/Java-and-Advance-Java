


class Foo{
    final void m1(){} //=> error
}
class Bar extends Foo{
    void m1(){}
}
class Main{

   
    public static void main(String[] args){
        int i =10;
        i = 20;
        final int j =100;

        System.out.println(i);
        System.out.println(j);
    }
}