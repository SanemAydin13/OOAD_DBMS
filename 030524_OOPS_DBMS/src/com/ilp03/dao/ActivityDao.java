package com.ilp03.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.ilp03.entity.Activity;

 
public class ActivityDao {

	public static Connection getConnection() {
		String connectionString ="jdbc:mysql://localhost:3306/employeewellness_db?useSSL=false";
		String userName ="root";
		String password ="Anjuma@123";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static ArrayList<Activity> getAllActivity(Connection connection) {
		Statement statement;
		ResultSet resultSet = null;
		ArrayList<Activity> activityList = new ArrayList<Activity>();
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from activity");
			while(resultSet.next()) {
				int id= resultSet.getInt(1);
	            String activityName = resultSet.getString(2);
	            String activityDescription = resultSet.getString(3);
	            double durationInHours = resultSet.getDouble(4);
	            String instructorId = resultSet.getString(5);
	            

	            Activity activity =new Activity(id,activityName,activityDescription,durationInHours,instructorId);
	            activityList.add(activity);
			}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return activityList;
	}

	
}
 