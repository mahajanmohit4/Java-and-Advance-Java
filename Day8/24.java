interface Hello{
    boolean test();
}

class World{
    static void show(int number , Hello referenceType){
        if(referenceType.test()){
            System.out.println("Function is ture");
        }
        else{
            System.out.println("Function is False");
        }
    }
}

class Main{
    public static void main(String[] args){
        World.show(11 , () -> { return true;});
        World.show(11 , () -> { return false;});
    }
}