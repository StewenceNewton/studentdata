package com.example.demo.studnetentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	@Id
	int rollNo;
	String name;
	int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentEntity [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
}
