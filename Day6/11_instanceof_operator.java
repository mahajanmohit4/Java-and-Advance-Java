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
       Person arr[] = {new Employee() , new Person()};

     
       for(Person i : arr){
           if(i instanceof Employee){
               Employee e = (Employee)i;
                e.getDept();
           }
           
       }
    }
}
