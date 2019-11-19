package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database 
{
	private String username;
	private String password;
	private String database;
	private String url;
	
	public Database()
	{
		this.username = "root";
		this.password = "root";
		this.database = "nmtsadb";
		this.url = "jdbc:mysql://localhost:3306/" + this.database;
	}
	
	public Connection open()
	{
		Connection conn = null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(this.url, this.username, this.password);
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			return conn;
		} 
		catch (InstantiationException e) 
		{
			e.printStackTrace();
			return conn;
		} 
		catch (IllegalAccessException e) 
		{	
			e.printStackTrace();
			return conn;
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			return conn;
		}
		
		return conn;
	}
	
	public int close(Connection conn)
	{
		try
		{
			conn.close();
			return 1;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
}
