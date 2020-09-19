
interface Abc
{
    public void show();
}
class AbcImpli implements Abc
{
    public void show()
    {
        System.out.println("In Show");
    }
}
 class Main
{
    public static void main(String[] args)
    {
       Abc obj = new AbcImpli();
       obj.show();
    }
}