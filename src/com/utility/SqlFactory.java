package com.utility;

import com.model.Admin;
import com.model.Client;

public class SqlFactory 
{
	@SuppressWarnings("rawtypes")
	public static String findQuery(Class cls)
	{
		String sql = "";
		
		if (cls.equals(Client.class))
		{
			sql = "SELECT * FROM client WHERE id = ?";
		}
		else if (cls.equals(Admin.class))
		{
			sql = "SELECT * FROM admin WHERE `username` = ? AND `password` = ?";
		}
		
		return sql;
	}
	
	@SuppressWarnings("rawtypes")
	public static String findAll(Class cls)
	{
		String sql = "";
		
		if (cls.equals(Client.class))
		{
			sql = "SELECT * FROM client";
		}
		
		return sql;
	}
	
	@SuppressWarnings("rawtypes")
	public static String create(Class cls)
	{
		String sql = "";
		
		if (cls.equals(Client.class))
		{
			sql = "INSERT INTO `client` (`id`, `time`, `first`, `last`, `birthday`, "
					+ "`phoneNumber`, `diagnosis`, `parentA`, `parentB`, `email`, "
					+ "`address`, `reason`, `funding`, `availableDay`, `availableTime`, `notes`) VALUES "
					+ "(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		}
		
		return sql;
	}
	
	@SuppressWarnings("rawtypes")
	public static String update(Class cls)
	{
		String sql = "";
		
		if (cls.equals(Client.class))
		{
			sql = "UPDATE client SET `time` = '?', `first` = '?', `last` = '?', `birthday` = '?',"
					+ "`phoneNumber` = '?', `diagnosis` = '?', `parentA` = '?', `parentB` = '?', `email` = '?',"
					+ "`address` = '?', `reason` = '?', `funding` = '?', `availableDay` = '?', `availableTime` = '?',"
					+ "`notes` = '?' WHERE `client`.`id` = '?'";
		}
		
		return sql;
	}
	
	@SuppressWarnings("rawtypes")
	public static String delete(Class cls)
	{
		String sql = "";
		
		if (cls.equals(Client.class)) 
		{
			sql = "DELETE FROM `client`	WHERE `client`.`id` = '?'";
		}
		
		return sql;
	}
	
	@SuppressWarnings("rawtypes")
	public static String generalSearch(Class cls)
	{
		String sql = "";
		
		if (cls.equals(Client.class))
		{
			sql = "SELECT * FROM `client` WHERE `time` LIKE ? OR `first` LIKE ? "
					+ " OR `last` LIKE ? OR `birthday` LIKE ? OR `phoneNumber` LIKE ? " 
					+ " OR `diagnosis` LIKE ? OR `parentA` LIKE ? OR `parentB` LIKE ? "
					+ " OR `email` LIKE ? OR `address` LIKE ? OR `reason` LIKE ? "
					+ " OR `funding` LIKE ? OR `availableDay` LIKE ? OR `availableTime` LIKE ?";
		}
		
		return sql;
	}
	
	@SuppressWarnings("rawtypes")
	public static String timeSearch(Class cls)
	{
		String sql = "";
		
		if (cls.equals(Client.class))
		{
			sql = "SELECT * FROM `client` WHERE `availableDay` LIKE ?"
					+ " OR `availableTime` LIKE ?";
		}
		
		return sql;
	}
}
