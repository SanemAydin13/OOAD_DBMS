package com.ilp03.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.ParticipationDao;
import com.ilp03.entity.Activity;
import com.ilp03.entity.Participation;

public class ParticipationServiceImpl implements ParticipationService {

    public void getAllParticipation() {
    	Connection connection = ParticipationDao.getConnection();
        Scanner scanner = new Scanner(System.in);
        try  {
            System.out.println("Enter activity Name:");
            String activityName = scanner.nextLine();
            ArrayList<Participation> participationList = ParticipationDao.getParticipationBasedOnActivityName(connection, activityName.toUpperCase());
            if (participationList.isEmpty()) {
                System.out.println("No participation found for the activity: " + activityName);
            } 
            else {
            	System.out.println("......................................................Participation Details......................................................");
            	System.out.println("**************************************************************************************************************************");
            	System.out.printf("%-20s | %-20s | %-20s | %-20s | %-12s | %-10s | %-20s\n",
            	        "Employee First Name", "Employee Last Name", "Activity Name", "Joining Date", "Reward Score", "Status", "Feedback");
            	System.out.println("**********************************************************************************************************************");
            	for (Participation participation : participationList) {
            	    System.out.printf("%-20s | %-20s | %-20s | %-20s | %-12s | %-10s | %-20s\n",
            	            participation.getEmployee().getEmployeeFirstName(),
            	            participation.getEmployee().getEmployeeLastName(),
            	            participation.getActivity().getActivityName(),
            	            participation.getJoiningDate(),
            	            participation.getRewards().getScore(),
            	            participation.getStatus(),
            	            participation.getFeedback().getFeedbackText());
            	}
            	System.out.println("**************************************************************************************************************************");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

	public static void displayAllParticipations() {
        ParticipationServiceImpl service = new ParticipationServiceImpl();
		service.getAllParticipation();   
    }
	
}
