interface Talk{
    void sayHello(String name);
}

class Main{
    static void takeAction(Talk ref){
        ref.sayHello("Mohit");
    }
    public static void main(String[] args){
        System.out.println("");
        Talk obj = new Talk(){
            public void sayHello(String name){
                System.out.println("Hello : "+name);
            }
        };
        // obj.sayHello("Mohit");
        Main.takeAction(obj);
    }
}