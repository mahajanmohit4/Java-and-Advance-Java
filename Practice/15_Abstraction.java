

abstract class Aphone
{
    public void config1()
    {
        System.out.println("configuration 1");
    }
    public abstract void config2();
    public abstract void config3();
    public abstract void config4();
   
}
abstract class Bphone extends Aphone
{
    public void config2()
    {
        System.out.println("configuration 2");
    }
}
class Cphone extends Bphone
{
    public void config3()
    {
        System.out.println("configuration 3");
    }
    public void config4()
    {
        System.out.println("configuration 4");
    }
}
class Main
{
    public static void main(String[] args)
    {
       Aphone obj = new Cphone();
       obj.config4();
       obj.config3();
       obj.config2();
       obj.config1();
    }
}