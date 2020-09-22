import java.util.*;
class Person{
    void show(){
        System.out.println("Person");
    }
}
class Employee extends Person{
  

     void show(){
        System.out.println("Employee");
    }
}

class Manager extends Employee{
     void show(){
        System.out.println("Manager");
    }
}

class Main{
    public static void main(String[] args){
        
     Person p = new Employee();
     Person p1 = new Manager();
     Person p2 = new Person();
    //  p1.show();
     Person arr[] = {new Person() , 
                        new Employee(),
                        new Manager()
                        };
        for(Person a : arr)
            a.show();
    }
}