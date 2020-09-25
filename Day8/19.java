
interface Hello{
    void show();
}
class World{
    // static void show1(Hello referenceType){
        static void show1(){
        System.out.println("Show Method !!");
        // referenceType.show();
    }
}
class Main{
    public static void main(String[] args){
        // World obj = new World();
        // obj.show1();
        // World.show1(() -> {});
        World.show1();
    }
}