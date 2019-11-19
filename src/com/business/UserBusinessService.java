package com.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.UserDataAccessInterface;
import com.model.Admin;
import com.model.DTO;

public class UserBusinessService implements UserBusinessInterface 
{
	UserDataAccessInterface userDAO;
	
	@Override
	public Admin authenticate(Admin admin) 
	{
		Admin user = userDAO.authenticate(admin).getData();
		return user;
	}

	@Override
	public void init() {}

	@Override
	public void destroy() {}

	@Autowired
	public void setDataService(UserDataAccessInterface userDAO)
	{
		this.userDAO = userDAO;
	}
}
