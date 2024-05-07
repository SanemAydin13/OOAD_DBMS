package com.ilp03.entity;
public class Activity {
	Employee employee;
	 private int id;
	 private String activityName;
	 private String activityDescription;
	 private double durationInHours;
	 private String instructorId ;
	public Activity(int id, String activityName, String activityDescription, double durationInHours, String instructorId) {
		//super();
		this.id = id;
		this.activityName = activityName;
		this.activityDescription = activityDescription;
		this.durationInHours = durationInHours;
		this.instructorId = instructorId;
	}
	public Activity() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityDescription() {
		return activityDescription;
	}
	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}
	public double getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(double durationInHours) {
		this.durationInHours = durationInHours;
	}
	
	public void setInstructorId(String instructorId) {
		this.instructorId = employee.getEmployeeFirstName();
	}
	public String getInstructorId() {
		// TODO Auto-generated method stub
		return employee.getEmployeeFirstName();
	}
	 

}
