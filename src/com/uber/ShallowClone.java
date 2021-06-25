package com.uber;

class Employee implements Cloneable {
	int eid;
	String name;
	Department dept;
	public Employee(int eid,String name, Department dept) {
		this.eid=eid;
		this.name=name;
		this.dept=dept;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Department{
	String grade;
	String designation;
	public Department(String grade,String designation) {
		this.grade = grade;
		this.designation = designation;
	}
}

public class ShallowClone {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d =new Department("IT","Lead");
		Employee emp = new Employee(788798, "suryaKumar", d);
		
		Employee emp1 =null;
		try {
			emp1 = (Employee) emp.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(emp.dept.designation);
		emp1.dept.designation = "Senior Software Engineer";

		System.out.println(emp.dept.designation);
	}

}
