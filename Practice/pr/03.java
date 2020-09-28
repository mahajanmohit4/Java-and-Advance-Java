interface I{

}
class A{

}
class B extends A{

}

class Main{
    public static void main(String[] agrs){

        int i;
        for(i=1;i<6;i++){
            if(i>3) continue;
        }
        System.out.println("Mohit"+i);
    }
}