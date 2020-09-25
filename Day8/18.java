interface Hello{
    void show();
    void show(int number);
}

class Main{
    static void bhejo(Hello referenceType){
        referenceType.show(111);
    }
    public static void main(String [ ] args){
        Hello  obj = new World(){
            public void show(){
                System.out.println("Anoymeous Class Called !!");
            }
            public void show(int number){
                System.out.println("Number is : "+number);
            }
        };
        obj.show();
        obj.show(1243);
        Main.bhejo(obj);
    }
}