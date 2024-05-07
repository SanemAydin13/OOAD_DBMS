package com.ilp03.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.ilp03.entity.Employee;

 
public class EmployeeDao {

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
	
	public static ArrayList<Employee> getAllEmployee(Connection connection) {
		Statement statement;
		ResultSet resultSet = null;
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from employee");
			while(resultSet.next()) {
				int id= resultSet.getInt(1);
	            String employeeFirstName = resultSet.getString(2);
	            String employeeLastName = resultSet.getString(3);
	            String department = resultSet.getString(4);
	            String address = resultSet.getString(5);
	            long phNumber = resultSet.getLong(6);
	            String createdByID = resultSet.getString(7); 
	            Date createdDate = resultSet.getDate(8);
	            String updatedByID = resultSet.getString(9); 
	            Date updatedDate = resultSet.getDate(10); 
	            

	            Employee employee = new Employee(id, employeeFirstName, employeeLastName, department, address,
                        phNumber, createdByID, createdDate, updatedByID, updatedDate);
	            employeeList.add(employee);
			}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employeeList;
	}

	
}
 

