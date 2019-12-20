package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.business.ClientBusinessInterface;
import com.model.Client;

@RestController
@RequestMapping("/clientAPI")
public class ClientAPI 
{
	@Autowired
	ClientBusinessInterface clientService;
	
	
	@PostMapping("/getAll")
	public List<Client> getAllClients()
	{
		List<Client> clients = clientService.findAll();
		
		return clients;
	}
}
