package com.ilp03.entity;

public class Rewards {
	Employee employee;
	private int id;
    private int score;
    private String updatedBy;
    public Rewards(int id, int score, String updatedBy) {
		//super();
		this.id = id;
		this.score = score;
		this.updatedBy = updatedBy;
	}
    
	public Rewards() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = employee.getEmployeeFirstName();
	}
	
}
