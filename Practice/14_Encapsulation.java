

class Student
{
    private int id;
    private String name;

    public void getId(int id)
    {
        this.id = id;
        System.out.println("value assigned");
    }
    public int setId()
    {
        System.out.println("value return");
        return id;
    }
    public void getName(String name)
    {
        this.name = name;
        System.out.println("name assigned");
    }
    public String setName()
    {
        System.out.println("name return");
        return name;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.getId(11);
        obj.getName("Mohit Mahajan");
        System.out.println(obj.setId());
        System.out.println(obj.setName());
    }
}