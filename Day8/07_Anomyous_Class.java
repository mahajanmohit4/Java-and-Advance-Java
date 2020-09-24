interface Talk{
    void sayHello(String name);
}
class TalkImple implements Talk{
    public void sayHello(String name){
        System.out.println("Welcome : "+name);
    }
}
class Main{
    static void takeAction(Talk ref){
        ref.sayHello("Mohit");
    }
    public static void main(String[] args){
        System.out.println("");
        Talk obj = new TalkImple();
        Main.takeAction(obj);
    }
}