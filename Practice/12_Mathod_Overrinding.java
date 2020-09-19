class A
{
    int i;
    public void show()
    {
        System.out.println("In Class A " + i);
    }

}

class B extends A
{
    public void show()
    {
        super.i = 4;
        super.show();
        System.out.println("In Class B");
    }

}

class Main
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
    }
}