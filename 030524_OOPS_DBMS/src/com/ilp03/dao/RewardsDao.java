package com.ilp03.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.ilp03.entity.Rewards;

 
public class RewardsDao {

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
	
	public static ArrayList<Rewards> getAllRewards(Connection connection) {
		Statement statement;
		ResultSet resultSet = null;
		ArrayList<Rewards> rewardsList = new ArrayList<Rewards>();
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from rewards");
			while(resultSet.next()) {
				int id= resultSet.getInt(1);
				int score= resultSet.getInt(2);
				String updatedBy= resultSet.getString(3);

				Rewards rewards =new Rewards(id,score,updatedBy);
				rewardsList.add(rewards);
			}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rewardsList;
	}

	
}
 