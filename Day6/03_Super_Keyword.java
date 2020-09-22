import java.util.*;
class Person{
    private String name;
  
   void set( String name){
   
       this.name = name;
   }
    void show(){
      
        System.out.println("\nName : " +name);
    }

  

}
class Employee extends Person{
    private float salary;

    void set(String name , float salary){
        set(name);
        this.salary = salary;
    }

     void show(){
        super.show();
        System.out.println(salary);
    }
}

class Manager extends Employee{
   private String dept;
   void set (String name , float salary , String dept){
       set(name , salary);
       this.dept = dept;
   }
    void show(){
        super.show();
        System.out.println(dept);
    }
}
class Main{
    public static void main(String[] args){
        
     Manager m = new Manager();
     m.set("Mohit" , 10000.22F , "CS" );
     m.show();
    }
}