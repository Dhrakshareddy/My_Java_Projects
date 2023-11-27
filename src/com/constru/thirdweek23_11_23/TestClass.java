package com.constru.thirdweek23_11_23;
class Student{
	String name;
	public Student() {
		System.out.println("unknown");
	}
	public Student(String name) {
		this.name=name;
		System.out.println(name);
	}
}
public class TestClass {
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student("ramya");
		
	}

}
