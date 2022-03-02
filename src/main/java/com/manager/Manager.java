package com.manager;

import java.util.Date;

public class Manager {
	int managerId;
	String name;
	int age;
	Date joiningDate;
	float salary;
	String phone;
	
	public Manager(int managerId, String name, int age, Date joiningDate, float salary,  String phone) {
		super();
		this.managerId = managerId;
		this.name = name;
		this.age = age;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.phone = phone;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
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

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", name=" + name + ", age=" + age + ", joiningDate=" + joiningDate
				+ ", salary=" + salary + ", phone=" + phone + "]";
	}
}
