package com.ilp03.entity;

import java.util.Date;


public class Employee {
	Employee employee;
	private int id;
	private String employeeFirstName;
	private String employeeLastName;
	private String department;
	private String address;
	private long phnumber;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	public Employee(int id, String employeeFirstName, String employeeLastName, String department,
			String address, long phnumber, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {
		//super();
		this.id = id;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.department = department;
		this.address = address;
		this.phnumber = phnumber;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}
	
 

	public Employee() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(long phnumber) {
		this.phnumber = phnumber;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = employee.employeeFirstName;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = employee.employeeFirstName;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}	
	
}
