import java.util.*;
class Employee{
    private int empId;
    private String empName;
    void set(int empId , String empName){
        // System.out.println("this : "+this);
        this.empId = empId;
        this.empName = empName;
    }
    void show(){
        System.out.println("this : "+this);
        System.out.println("EmpId : " +empId+ "\nName : " +empName);
    }

}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Employee arr[] = new Employee[3];

        for (int i=0 ;i<arr.length ; i++){
             System.out.print("Enter Id and Name : ");
             int empId = sc.nextInt();
             String empName = sc.next();
             
            Employee e = new Employee();
            // System.out.println("e : "+e);
            e.set(empId,empName);
            arr[i] = e;
        }

        for(Employee j : arr){
            j.show();
        }
     
    }
}