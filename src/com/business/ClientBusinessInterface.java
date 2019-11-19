package com.business;

import java.util.List;

import com.model.Client;
import com.model.DTO;

public interface ClientBusinessInterface 
{
	public DTO<Client> find(int ID);
	public List<Client> findAll();
	public Client register(Client client);
	public DTO<Client> edit(Client client);
	public DTO<Client> remove(int ID);
	public List<Client> search(String query);
	public List<Client> searchByTime(String query);
	
	public void init();
	public void destroy();
}
