package day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

class Employee{
	private int empId;
	private String empName;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public int hashCode() {
		return empId;
	}
	
	
	
}

public class pr11 {

	public static void main(String[] args) {

		HashSet<Employee> a = new HashSet<>();
		
		a.add(new Employee(11,"mohit"));
		a.add(new Employee(22,"deepak"));
		a.add(new Employee(33,"amit"));
		a.add(new Employee(44,"kunal"));
		a.add(new Employee(22,"deepak"));
		
	
		for(Employee e : a) {
			System.out.println(e);
		}
	
	}


}
