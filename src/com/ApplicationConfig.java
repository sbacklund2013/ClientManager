package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.business.ClientBusinessInterface;
import com.business.ClientBusinessService;
import com.business.UserBusinessInterface;
import com.business.UserBusinessService;
import com.controller.ClientController;
import com.data.ClientDAO;
import com.data.ClientDataAccessInterface;
import com.data.UserDAO;
import com.data.UserDataAccessInterface;

@Configuration
public class ApplicationConfig 
{
	@Bean(name="clientController")
	public ClientController getClientController()
	{
		return new ClientController();
	}
	
	@Bean(name="clientService", initMethod="init", destroyMethod="destroy")
	@Scope(value="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public ClientBusinessInterface getService()
	{
		return new ClientBusinessService();
	}
	
	@Bean(name="clientDAO", initMethod="init", destroyMethod="destroy")
	@Scope(value="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public ClientDataAccessInterface getDataService()
	{
		return new ClientDAO();
	}
	
	@Bean(name="userService", initMethod="init", destroyMethod="destroy")
	@Scope(value="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public UserBusinessInterface getUserService()
	{
		return new UserBusinessService();
	}
	
	@Bean(name="adminDAO", initMethod="init", destroyMethod="destroy")
	@Scope(value="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public UserDataAccessInterface getUserDataService()
	{
		return new UserDAO();
	}
}

