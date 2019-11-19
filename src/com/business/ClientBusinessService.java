package com.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.ClientDataAccessInterface;
import com.model.Client;
import com.model.DTO;

public class ClientBusinessService implements ClientBusinessInterface 
{
	ClientDataAccessInterface clientDAO;
	
	@Override
	public DTO<Client> find(int ID) 
	{
		DTO<Client> cDTO = clientDAO.read(ID);
		return null;
	}
	
	@Override
	public List<Client> findAll()
	{
		List<Client> clients = clientDAO.readAll().getData();
		return clients;
	}

	@Override
	public Client register(Client client) 
	{
		DTO<Client> cDTO = clientDAO.create(client);
		if(cDTO.getRowCount() == 0)
		{
			System.out.println("No rows were created");
			return null;
		}else if(cDTO.getRowCount()==1) {
			System.out.println("Rows were changed");
			return client;
		}else {
			System.out.println("ERROR: more than one row was created somehow");
			return null;
		}
		
	}

	@Override
	public DTO<Client> edit(Client client) 
	{
		DTO<Client> cDTO = clientDAO.update(client);
		return null;
	}

	@Override
	public DTO<Client> remove(int ID) 
	{
		clientDAO.delete(ID);
		return null;
	}
	
	@Override
	public List<Client> search(String query) 
	{
		List<Client> results = clientDAO.search(query).getData();
		return results;
	}
	
	@Override
	public List<Client> searchByTime(String query)
	{
		List<Client> results = clientDAO.searchByTime(query).getData();
		return results;
	}
	
	@Override
	public void init() {}

	@Override
	public void destroy() {}
	
	@Autowired
	public void setDataService(ClientDataAccessInterface clientDAO)
	{
		this.clientDAO = clientDAO;
	}
}
