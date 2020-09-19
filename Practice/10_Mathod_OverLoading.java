import java.util.Scanner;

class Overloading
{
    public void add(int i, int j)
    {
        System.out.println(i+j);
    }

    public void add(int i, int j, int k)
    {
        System.out.println(i+j+k);
    }

    public void add(double i, double j)
    {
        System.out.println(i+j);
    }
}
class Main{
    public static void main(String []agds)
    {
        Overloading obj = new Overloading();
        obj.add(5,5);
        obj.add(5,5,5);
        obj.add(5.5,5.5);
    }
}
