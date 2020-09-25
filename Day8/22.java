interface Hello{
    int test();
}

class World{
    static void show(Hello ref){
   
       int num = ref.test();
       System.out.println("Number is : "+num);
       
    }
}

class Main{
    public static void main(String[] args){
        World.show( () -> { return 111;});
        World.show( () -> { return 121;});
    }
}