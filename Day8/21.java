interface Hello{
    int test(int number);
}

class World{
    static void show(int number , Hello referenceType){
       System.out.println("Number is : "+number);
       int num = referenceType.test(number);
       System.out.println("Number is : "+num);
       
    }
}

class Main{
    public static void main(String[] args){
        World.show(1 , (int number) -> { return 111;});
        World.show(1 , (int number) -> { return 121;});
    }
}