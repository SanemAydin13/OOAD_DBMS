package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ilp03.dao.ActivityDao;
import com.ilp03.entity.Activity;

public class ActivityService {
	public static void getAllActivity() {
			Connection connection = ActivityDao.getConnection();
			ArrayList<Activity> activityList = ActivityDao.getAllActivity(connection);
			System.out.println("***************************************************************************************************");
			System.out.println("|ID\t\t|Activity Name\t\t|Activity Description\t\t\t| Duration(in hrs)");
			System.out.println("************************************************************************************************");
			for(Activity activity : activityList) {
			    System.out.printf("|%-8s | %-20s | %-30s | %-15s |\n", 
			        activity.getId(), 
			        activity.getActivityName(), 
			        activity.getActivityDescription(), 
			        activity.getDurationInHours());
			    System.out.println("-------------------------------------------------------------------------------------------------------");
			}
            try {
			connection.close();
			}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
