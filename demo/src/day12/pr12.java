package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Employee1{
	private int empId;
	private String empName;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
}

public class pr12 {

	public static void main(String[] args) {

		ArrayList<Employee1> a = new ArrayList<>();
		
		a.add(new Employee1(11,"mohit"));
		a.add(new Employee1(22,"deepak"));
		a.add(new Employee1(33,"amit"));
		a.add(new Employee1(44,"kunal"));
		
	
		for(Employee1 e : a) {
			System.out.println(e);
		}
	
	}


}
