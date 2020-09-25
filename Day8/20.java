interface Hello{
    boolean test(int number);
}

class World{
    static void show(int number , Hello referenceType){
        if(referenceType.test(number)){
            System.out.println("Function is ture");
        }
        else{
            System.out.println("Function is False");
        }
    }
}

class Main{
    public static void main(String[] args){
        World.show(11 , (int number) -> { return true;});
        World.show(11 , (int number) -> { return false;});
    }
}