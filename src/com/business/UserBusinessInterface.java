package com.business;

import com.model.Admin;

public interface UserBusinessInterface 
{
	public Admin authenticate(Admin admin);
	
	public void init();
	public void destroy();
}
