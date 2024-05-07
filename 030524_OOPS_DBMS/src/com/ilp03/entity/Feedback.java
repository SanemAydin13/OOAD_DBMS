package com.ilp03.entity;

public class Feedback {
	private int id;
    private int participationId;
    private String feedbackText;
	public Feedback(int id, int participationId, String feedbackText) {
		//super();
		this.id = id;
		this.participationId = participationId;
		this.feedbackText = feedbackText;
	}
	public Feedback() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParticipationId() {
		return participationId;
	}
	public void setParticipationId(int participationId) {
		this.participationId = participationId;
	}
	public String getFeedbackText() {
		return feedbackText;
	}
	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}

}
