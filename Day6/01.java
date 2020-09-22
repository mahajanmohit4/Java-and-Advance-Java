import java.util.*;
class Employee{
    private int empId;
    private String empName;

   void set(int empId , String empName){
       this.empId = empId;
       this.empName = empName;
   }
    void show(){
      
        System.out.println("EmpId : " +empId+ "\nName : " +empName);
    }

    // Employee show(){
      
    //     System.out.println("EmpId : " +empId+ "\nName : " +empName);
    // }
    // Object show(){
      
    //     System.out.println("EmpId : " +empId+ "\nName : " +empName);
    // }

}
class Manager extends Employee{
    private int ta;
    private int da;
    void set(int empId, String empName , int ta , int da){
        set(empId , empName);
        this.ta = ta;
        this.da = da;
    }

    protected void show(){
        super.show();
        System.out.println(ta+" "+da);
    }
}
class Main{
    public static void main(String[] args){
        
        Manager m = new Manager();
        m.set(11,"Mohit",100,200);
        m.show();
     
    }
}