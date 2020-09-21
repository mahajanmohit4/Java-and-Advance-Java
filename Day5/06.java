import java.util.*;
class Employee{
    private int empId;
    private String empName;

    Employee(){
        empId = 100;
        empName = "abc";
    }
    Employee(int empId , String empName){
       
        this.empId = empId;
        this.empName = empName;
    }
    void show(){
      
        System.out.println("EmpId : " +empId+ "\nName : " +empName);
    }

}

class Main{
    public static void main(String[] args){
        Employee e = new Employee(11,"Mohit");
        e.show();
        Employee e1 = new Employee();
        e1.show();
     
    }
}