interface A{
    void show();
}
class Hello{
    void show(){
        System.out.println("Hello Class !!");
    }
}
class Main{
    public static void main(String[] args){
        Hello obj = new Hello();
        obj.show();
    }
}