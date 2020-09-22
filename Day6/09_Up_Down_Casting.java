import java.util.*;
class Person{
    void getDetail(){
        System.out.println("Person details ");
    }
    void getJob(){
        System.out.println("Person job ");
    }
}
class Employee extends Person{
    void getJob(){
        System.out.println("Employee job ");
    }
    void getDept(){
        System.out.println("Employee dept ");
    }
}


class Main{
    public static void main(String[] args){
        Person p = new Employee(); //up casting
        Employee e = (Employee)p;  //down casting
        // Employee e = new Person(); //=>Error;
        // e.getJob();
        // e.getDetail();
        // e.getDept();

        p.getJob();
        p.getDetail();
        // p.getDept();
    }
}
