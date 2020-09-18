
class Outer
{
    public void show()
    {
        System.out.println("In Outer class");
    }

    static class Inner
    {
        public void show()
        {
            System.out.println("In Inner class");
        }
    }

}

class Main
{
    public static void main(String [] args)
    {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = new Outer.Inner();
        obj1.show();
    }
}