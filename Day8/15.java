class Outer{
    static class Inner{
        void show(){
            System.out.println("Inner class Method !!");
        }
    }
}

class Main{
    public static void main(String[] args){
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}