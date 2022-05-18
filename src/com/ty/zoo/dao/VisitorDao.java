package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ty.zoo.dto.Visitor;
import com.ty.zoo.util.ConnectionObject;

public class VisitorDao {

	public int saveVisitor(Visitor visitor)
	{
		String query = "insert into visitor values(?,?,?,?,?,?)" ;
		Connection connection = ConnectionObject.getConnection() ;
		
		try {
			PreparedStatement preparedStatement =  connection.prepareStatement(query) ;
			preparedStatement.setInt(1, visitor.getId());
			preparedStatement.setString(2, visitor.getName());
			preparedStatement.setString(3, visitor.getEmail());
			preparedStatement.setString(4, visitor.getPhone());
			preparedStatement.setString(5, visitor.getGender());
			preparedStatement.setInt(6, visitor.getAge());
			return preparedStatement.executeUpdate() ;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0 ;
	}
	
	public Visitor getVisitorById(int id)
	{
		String query = "select * from visitor where id ="+id ;
		Connection connection = ConnectionObject.getConnection() ;
		
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query) ;
			if(resultSet.next())
			{
				Visitor visitor = new Visitor() ;
				visitor.setId(resultSet.getInt(1));
				visitor.setName(resultSet.getString(2));
				visitor.setEmail(resultSet.getString(3));
				visitor.setPhone(resultSet.getString(4));
				visitor.setGender(resultSet.getString(5));
				visitor.setAge(resultSet.getInt(6));
				
				return visitor ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null ;
	}
}
