package day10;

class Employee{
	private int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
//	@Override
//	public boolean equals(Object obj) {
//		Employee emp = (Employee)obj;
//		return empId == emp.empId;
//	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj instanceof Employee) {
			Employee emp = (Employee)obj;
			return empId == emp.empId;
		}
		return false;
	}
}

public class EqualsDemo {
	public static void main(String[] args) {
		Employee e1 =new Employee(101 , "Mohit");
		Employee e2 = e1;
		Employee e3 =new Employee(101 , "Mohit");
		Employee e4 =new Employee(102 , "Deepak");
		System.out.println("e1.equal(e2) : "+e1.equals(e2));
		System.out.println("e1.equal(e3) : "+e1.equals(e3));
		System.out.println("e2.equal(e4) : "+e2.equals(e4));

 	}
}
