import java.util.*;
class Employee{
    private int empId;
    private String empName;

    Employee(){
       this(100,"ABC");
       System.out.println("no arg");
            // Employee(11,"Mohit");
    }
    Employee(int empId , String empName){
       System.out.println("paramterized arg");
        this.empId = empId;
        this.empName = empName;
    }
    void show(){
      
        System.out.println("EmpId : " +empId+ "\nName : " +empName);
    }

}

class Main{
    public static void main(String[] args){
        
        Employee e1 = new Employee();
        // e1.show();
        // Employee e = new Employee(11,"Mohit");
        // e.show();
     
    }
}