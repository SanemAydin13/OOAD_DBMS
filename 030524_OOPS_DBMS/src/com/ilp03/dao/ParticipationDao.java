package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ilp03.entity.Activity;
import com.ilp03.entity.Employee;
import com.ilp03.entity.Feedback;
import com.ilp03.entity.Participation;
import com.ilp03.entity.Rewards;

public class ParticipationDao {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/employeewellness_db";
        String userName = "root";
        String password = "Anjuma@123";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

public static ArrayList<Participation> getParticipationBasedOnActivityName(Connection connection, String activityName) {
    ArrayList<Participation> participationList = new ArrayList<>();
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        String query = "SELECT e.id AS employee_id, e.first_name AS first_name, e.last_name AS last_name, a.activity_name, r.score, p.joining_date, p.status, f.feedback_text "
                     + "FROM participation p "
                     + "JOIN employee e ON p.employee_id = e.id "
                     + "JOIN activity a ON p.activity_id = a.id "
                     + "JOIN rewards r ON p.rewards_id = r.id "
                     + "LEFT JOIN feedback f ON p.id = f.participation_id "
                     + "WHERE a.activity_name = ?";
        statement = connection.prepareStatement(query);
        statement.setString(1, activityName);
        resultSet = statement.executeQuery();
        while (resultSet.next()) {
        	Employee employee =new Employee();
            Participation participation =new Participation();
            Activity activity= new Activity();
            Rewards rewards =new Rewards();
            Feedback feedback=new Feedback();
            
            employee.setEmployeeFirstName(resultSet.getString("first_name")); 
            employee.setEmployeeLastName(resultSet.getString("last_name")); 
            activity.setActivityName(resultSet.getString("activity_name")); 
            rewards.setScore(resultSet.getInt("score"));
            participation.setJoiningDate(resultSet.getDate("joining_date")); 
            participation.setStatus(resultSet.getString("status")); 
            feedback.setFeedbackText(resultSet.getString("feedback_text")); 
            
            participation.setEmployee(employee);
            participation.setActivity(activity);
            participation.setRewards(rewards);
            participation.setFeedback(feedback);
            
            participationList.add(participation);

        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return participationList;
}
}
