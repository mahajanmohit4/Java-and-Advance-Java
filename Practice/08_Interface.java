
interface A
{

}
class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
}
class Main
{
    public static void main(String[] args)
    {
       B obj = new B();

       if(obj instanceof A)
           obj.show();
       else
           System.out.println("NOT IN A");
    }
}