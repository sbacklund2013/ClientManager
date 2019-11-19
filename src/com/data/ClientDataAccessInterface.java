package com.data;

import java.util.List;

import com.model.Client;
import com.model.DTO;

public interface ClientDataAccessInterface 
{
	public DTO<Client> read(int ID);
	public DTO<List> readAll();
	public DTO<Client> create(Client client);
	public DTO<Client> update(Client client);
	public DTO<Client> delete(int ID);
	public DTO<List> search(String query);
	public DTO<List> searchByTime(String query);
	
	public void init();
	public void destroy();
}
