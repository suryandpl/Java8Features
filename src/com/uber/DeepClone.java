package com.uber;

class Employee1 implements Cloneable{
	int eid;
	String name;
	Department1 dept;
	public Employee1(int id,String name,Department1 dept){
		this.eid =id;
		this.name =name;
		this.dept = dept;
	}
	protected Object clone() throws CloneNotSupportedException {
		Employee1 emp = (Employee1)super.clone();
		emp.dept = (Department1) dept.clone();
		return emp;
		
	}
}
class Department1 implements Cloneable{
	String grade;
	String designation;
	public Department1(String grade,String designation) {
		this.grade = grade;
		this.designation = designation;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class DeepClone {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department1 d1 =new Department1("IT","Lead");
		
		Employee1 emp = new Employee1(788798, "suryaKumar", d1);
		
		Employee1 emp1 =null;
		try {
			emp1 = (Employee1) emp.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(emp.dept.designation);
		emp1.dept.designation = "Senior Software Engineer";

		System.out.println(emp.dept.designation);
		System.out.println(emp1.dept.designation);
	}

}
