package com.nonaccess1.seconweeks15_11_23;

public class Employee extends Company
{
	public int empid;
	private String name;
	protected int age;
	 int salary;
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.companyId);
		System.out.println(employee.location);
		System.out.println(employee.empid);
		System.out.println(employee.age);
		System.out.println(employee.name);
		System.out.println(employee.salary);
		
	}
	
}
