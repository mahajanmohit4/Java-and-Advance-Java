
class Outer{
    void show(){
        System.out.println("Outer1");
        class Inner {
            void show(){
                System.out.println("Inner Class Method !!");
            }
        }
        Inner obj = new Inner();
        obj.show();
        System.out.println("Oute2");
    }
}
class Main{
    public static void main(String [ ] args){
        System.out.println("Hello");
        Outer obj = new Outer();
        obj.show();
    }
}