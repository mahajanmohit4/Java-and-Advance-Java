
class Outer{
    class Inner{
        void show(){
            System.out.println("Inner Class !! ");
        }
        class In{
            void show(){
                System.out.println("In Class Method !!");
            }
        }
    }
    void show(){
        System.out.println("Outer Class Mehtod !!");
    }
}
class Main{
    public static void main(String[] args){
        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = obj.new Inner();
        obj1.show();
        Outer.Inner.In obj2 = obj1.new In();
        obj2.show();
    }
}