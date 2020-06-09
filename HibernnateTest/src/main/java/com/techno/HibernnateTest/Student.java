package com.techno.HibernnateTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int rollno;
	@Column(name="std_name")
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	

}
