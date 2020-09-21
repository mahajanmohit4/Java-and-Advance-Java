class Employee{
    private int empId;
    private String empName;
    void set(int id , String name){
        empId = id;
        empName = name;
    }
    void show(){
        System.out.println("EmpId : " +empId+ "\nName : " +empName);
    }

}
class Main{
    public static void main(String[] args){
       Employee e = new Employee();
       e.set(101 , "Mohit");
       e.show();
    }
}