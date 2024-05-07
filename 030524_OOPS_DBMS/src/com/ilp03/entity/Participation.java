package com.ilp03.entity;

import java.util.Date;

public class Participation {
	Employee employee;
	Activity activity;
	Rewards rewards;
	Feedback feedback;
	private int id;
    private Date joiningDate;
    private String status;
	

	


	public Participation(Employee employee, Activity activity, Rewards rewards, Feedback feedback,
			Date joiningDate, String status) {
		super();
		this.employee = employee;
		this.activity = activity;
		this.rewards = rewards;
		this.feedback = feedback;
		this.joiningDate = joiningDate;
		this.status = status;
	}




	public Participation() {
		// TODO Auto-generated constructor stub
	}




	public Employee getEmployee() {
		return employee;
	}




	public void setEmployee(Employee employee) {
		this.employee = employee;
	}




	public Activity getActivity() {
		return activity;
	}




	public void setActivity(Activity activity) {
		this.activity = activity;
	}




	public Rewards getRewards() {
		return rewards;
	}




	public void setRewards(Rewards rewards) {
		this.rewards = rewards;
	}




	public Feedback getFeedback() {
		return feedback;
	}




	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Date getJoiningDate() {
		return joiningDate;
	}




	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}









}
