interface Hello{
    void show(int a);
}
class World implements Hello{
    public void show(int a){
        System.out.println("Number is : "+a);
    }
}
class Main{
    static void bhejo(Hello referenceType){
        referenceType.show(143);
    }
    public static void main(String[] a){
        Hello obj = new World();
        Main.bhejo(obj);
    }
}