package com.oops.thirdweek21_11_23;
class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person1 {
    String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    @Override
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Student ID: " + studentId);
    }
}


public class DataBinding 
{
 public static void main(String[] args) {
	// Data binding using superclass object
     Person1 personObj = new Person1("John Doe", 25);
     personObj.displayInfo();

     // Data binding using subclass object
     Student studentObj = new Student("Jane Smith", 20, "12345");
     studentObj.displayInfo();
}
}
