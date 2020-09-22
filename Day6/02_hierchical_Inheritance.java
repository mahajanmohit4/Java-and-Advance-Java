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

class Clerk extends Employee{
    private int hra;
    void set(int empId , String empName , int hra){
        set(empId , empName);
        this.hra = hra;
    }
    void show(){
        super.show();
        System.out.println(hra);
    }
}
class Main{
    public static void main(String[] args){
        
        Manager m = new Manager();
        m.set(11,"Mohit",100,200);
        m.show();

        Clerk c = new Clerk();
        c.set(111,"Deepak",1234);
        c.show();
     
    }
}