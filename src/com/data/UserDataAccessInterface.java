package com.data;

import com.model.Admin;
import com.model.DTO;

public interface UserDataAccessInterface 
{
	public DTO<Admin> authenticate(Admin admin);
	
	public void init();
	public void destroy();
}
