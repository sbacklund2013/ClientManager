package com.model;

public class Admin 
{
	private String name;
	private String username;
	private String password;
	
	public Admin(String name, String username, String password) 
	{
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public Admin() 
	{
		this.name = "";
		this.username = "";
		this.password = "";
	}

	public String getName() { return name; }
	public String getUsername() { return username; }
	public String getPassword() { return password; }

	public void setName(String name) { this.name = name; }
	public void setUsername(String username) { this.username = username; }
	public void setPassword(String password) { this.password = password; }
}
