
package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.business.ClientBusinessInterface;
import com.business.EmailService;
import com.model.Client;
import com.model.DTO;

@Controller
@RequestMapping("/client")
public class ClientController 
{
	ClientBusinessInterface clientService;
		
	@RequestMapping(path="/referral", method=RequestMethod.GET)
	public ModelAndView displayForm() 
	{
		Client c = new Client();
		
		return new ModelAndView("ReferralForm", "client", new Client());
	}
	
	@RequestMapping(path = "/reg", method =RequestMethod.POST) 
	public ModelAndView tryReg(@Valid @ModelAttribute("client")Client client, BindingResult result) 
	{
		if(result.hasErrors()) 
		{
			System.out.println("Form had validation errors");
			return new ModelAndView("ReferralForm","client",client);
		}
		if(clientService.register(client)!=null) 
		{
			EmailService email = new EmailService();
			client.setEmail("ericwaters2019@gmail.com");
			email.sendEmail(client);
			return new ModelAndView("Results","client", client);
		}
		
		String msg = "Error Occurred";
		return new ModelAndView("Error","msg",msg);
	}
	
	@RequestMapping(path = "/appointments", method = RequestMethod.GET)
	public ModelAndView showAppointments()
	{
		return new ModelAndView("ShowAllClients", "client", new Client());
	}
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView showAllClients()
	{
		List<Client> clients = clientService.findAll();
		
		ModelAndView mv = new ModelAndView("ShowAllClients", "clients", clients);
		Client query = new Client();
		
		mv.addObject("query", query);
		
		return mv;
	}
	
	@RequestMapping(path = "/genSearch", method = RequestMethod.POST)
	public ModelAndView generalSearch(@ModelAttribute("query")Client query)
	{
		List<Client> results = new ArrayList<>();
		results = clientService.search(query.getNotes());
		
		ModelAndView mv = new ModelAndView("ShowAllClients", "clients", results);
		query = new Client();
		
		mv.addObject("query", query);
		
		return mv;
	}
	
	@RequestMapping(path = "/available", method = RequestMethod.POST)
	public ModelAndView availableSearch(@ModelAttribute("query")Client query)
	{
		List<Client> results = new ArrayList<>();
		
		String time = query.getNotes();
		switch(time.toLowerCase())
		{
		case "monday":
			time = "Mon";
			break;
		case "tuesday":
			time = "Tues";
			break;
		case "wednesday":
			time = "Wed";
			break;
		case "thursday":
			time = "Thur";
			break;			
		case "friday":
			time = "Fri";
			break;
		}
		
		results = clientService.searchByTime(time);
		
		ModelAndView mv = new ModelAndView("ShowAllClients", "clients", results);
		query = new Client();
		
		mv.addObject("query", query);
		
		return mv;
	}
	
	@Autowired
	public void setService(ClientBusinessInterface clientService)
	{
		this.clientService = clientService;
	}
	//checkboxes
	 @ModelAttribute("diagnosisList")
	   public List<String> getWebFrameworkList() {
	      List<String> diagnosisList = new ArrayList<String>();
	      diagnosisList.add("ADHD");
	      diagnosisList.add("Asperger's Syndrome");
	      diagnosisList.add("Autism");
	      diagnosisList.add("Cerebral Palsy");
	      diagnosisList.add("Down Syndrome");
	      diagnosisList.add("PDD");
	      diagnosisList.add("Parkingson's Disease");
	      diagnosisList.add("Stroke");
	      diagnosisList.add("Traumatic Brain Injury");
	      return diagnosisList;
	   }
	 @ModelAttribute("availableDay")
	   public List<String> getAvailableDay() {
	      List<String> diagnosisList = new ArrayList<String>();
	      diagnosisList.add("Monday");
	      diagnosisList.add("Tuesday");
	      diagnosisList.add("Wednesday");
	      diagnosisList.add("Thursday");
	      diagnosisList.add("Friday");
	      
	      return diagnosisList;
	   }
	 @ModelAttribute("availableTime")
	   public List<String> getAvailableTime() {
	      List<String> diagnosisList = new ArrayList<String>();
	      diagnosisList.add("8:30-9:00");
	      diagnosisList.add("9:00-9:30");
	      diagnosisList.add("9:30-10:00");
	      diagnosisList.add("10:00-10:30");
	      diagnosisList.add("10:30-11:00");
	      diagnosisList.add("11:00-11:30");
	      diagnosisList.add("11:30-12:00");
	      diagnosisList.add("12:00-12:30");
	      diagnosisList.add("12:30-1:00");
	      diagnosisList.add("1:00-1:30");
	      diagnosisList.add("1:30-2:00");
	      diagnosisList.add("2:00-2:30");
	      diagnosisList.add("2:30-3:00");
	      diagnosisList.add("3:00-3:30");
	      diagnosisList.add("3:30-4:00");
	      diagnosisList.add("3:00-3:30");
	      diagnosisList.add("3:30-4:00");
	      diagnosisList.add("4:00-4:30");
	      diagnosisList.add("4:30-5:00");
	      diagnosisList.add("5:00-5:30");
	      diagnosisList.add("5:30-6:00");
	      return diagnosisList;
	   }
}