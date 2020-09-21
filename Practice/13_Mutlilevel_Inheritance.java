
class A
{
    public int add(int i, int j)
    {
        return i+j;
    }
}

class B extends A
{
    public int sub(int i, int j)
    {
        return i-j;
    }
}

class C extends B
{
    public int mult(int i, int j)
    {
        return i*j;
    }
}

class Main
{
    public static void main(String[] args)
    {
        C obj = new C();
        int a =  obj.add(5,5);
        int b = obj.sub(10,5);
        int c = obj.mult(3,3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}