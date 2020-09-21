class Employee{
    private int empId;
    private String empName;
    private static int total;
    void set(int id , String name , int t){
        empId = id;
        empName = name;
        total = t;
    }
    void show(){
        System.out.println("EmpId : " +empId+ "\nName : " +empName+" total "+total);
    }

}
class Main{
    public static void main(String[] args){
       Employee e = new Employee();
       e.set(101 , "Mohit",11);
       e.show();
       Employee e1 = new Employee();
       e1.set(101 , "Deepak",22);
       e1.show();
       e.show();

       
      
    }
}