package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ty.zoo.dto.User;
import com.ty.zoo.util.ConnectionObject;

public class UserDao {

	public int saveUser(User user)
	{
		String query = "insert into user values(?,?,?,?,?,?,?)" ;
		
		Connection connection = ConnectionObject.getConnection() ;
		
		return 0 ;
	}
}
