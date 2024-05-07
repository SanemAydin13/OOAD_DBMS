package com.ilp03.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.ilp03.entity.Feedback;

 
public class FeedbackDao {

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
	
	public static ArrayList<Feedback> getAllFeedback(Connection connection) {
		Statement statement;
		ResultSet resultSet = null;
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from feedback");
			while(resultSet.next()) {
				int id= resultSet.getInt(1);
				int participationId= resultSet.getInt(2);
				String feedbackText = resultSet.getString(3);

				Feedback feedback =new Feedback(id,participationId,feedbackText);
				feedbackList.add(feedback);
			}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return feedbackList;
	}

	
}
 