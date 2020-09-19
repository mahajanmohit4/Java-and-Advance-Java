import java.util.Scanner;

class add
{
    public add(int i, int j)
    {
        System.out.println(i+j);
    }

    public add(int i, int j, int k)
    {
        System.out.println(i+j+k);
    }

    public add(double i, double j)
    {
        System.out.println(i+j);
    }
}
class Main{
    public static void main(String []agds)
    {
        add o = new add(5,5);
        add o1 = new add(5,5,5);
        add o2 = new add(5.5,5.5);
    }
}
