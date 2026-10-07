package com.Student.Portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_database")
public class StudentDatabase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer sid;
	String Student_Fname;
	String Student_Lname;
	int age;
	String City;
	double Marks;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getStudent_Fname() {
		return Student_Fname;
	}
	public void setStudent_Fname(String student_Fname) {
		Student_Fname = student_Fname;
	}
	public String getStudent_Lname() {
		return Student_Lname;
	}
	public void setStudent_Lname(String student_Lname) {
		Student_Lname = student_Lname;
	}
	public int getAge() {
		
		return age;
	}
	public void setAge(int age) {
		if(age >0 && age < 120) {
			this.age = age;
		}else {
			System.out.println("Invalid Age");
		}
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public double getMarks() {
		return Marks;
	}
	public void setMarks(double marks) {
		Marks = marks;
	}
}
