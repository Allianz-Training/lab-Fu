package com.allianz.day3;

public class Employee2 {
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	public Employee2(int id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public int getID() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getName() {
		return firstname + " " + lastname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary() {
		return salary*12;
	}
	public int raiseSalary(int percent) {
		return (salary*percent)+salary;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + firstname + " " + lastname + ", salary=" + salary
				+ "]";
	}
	
}
