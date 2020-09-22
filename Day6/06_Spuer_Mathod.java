import java.util.*;
class Person{
   Person(){
       System.out.println("no arg Person ");
   }
    Person(int i){
       System.out.println("param arg Person ");
   }
}
class Employee extends Person{
    Employee(){
        // super();
        System.out.println("no agr Employee ");
    }
    Employee(int i){
        super(i);
        System.out.println("param agr Employee ");
    }
}


class Main{
    public static void main(String[] args){
        Employee e = new Employee();
        Employee e1 = new Employee(1);
    }
}
