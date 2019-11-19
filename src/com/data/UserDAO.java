package com.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Admin;
import com.model.DTO;
import com.model.Database;

public class UserDAO implements UserDataAccessInterface 
{
	Database db = null;
	
	public UserDAO()
	{
		this.db = new Database();
	}

	@Override
	public DTO<Admin> authenticate(Admin admin) 
	{
		Connection conn = null;
		DTO<Admin> dto = null;
		
		try
		{
			conn = db.open();
			
			PreparedStatement sql = conn.prepareStatement("SELECT * FROM admin WHERE `username` = ? "
					+ " AND `password` = ?");
			
			sql.setString(1, admin.getUsername());
			sql.setString(2, admin.getPassword());
			ResultSet rs = sql.executeQuery();
			
			int rowCount = 0;
			
			Admin user = null;
			if(rs.next())
			{
				rowCount++;
				user = new Admin(rs.getString("name"), rs.getString("username"), rs.getString("password"));
			}
			dto = new DTO<Admin>(rowCount, ((rowCount > 0) ? "OK" : "FAILURE"), user);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			db.close(conn);
		}
		
		return dto;
	}

	@Override
	public void init() {}

	@Override
	public void destroy() {}

}
