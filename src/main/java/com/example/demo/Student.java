package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", roll=" + roll + "]";
	}
	private String name;
	public Student(int id, String name, String city, int roll) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.roll = roll;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	private String city;
	private int roll;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
