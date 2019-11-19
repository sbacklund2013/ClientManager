package com.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Client {
	
	private String timeStamp;
	@NotNull(message="Cannot be empty")
	private String firstName;
	@NotNull(message="Cannot be empty")
	private String lastName;
	@NotNull(message="Cannot be empty")
	private String birthDate;
	@NotNull(message="Cannot be empty")
	private String diagnosis;
	@NotNull(message="Cannot be empty")
	private String phoneNumber;
	@NotNull(message="Cannot be empty")
	private String parent1;
	@NotNull(message="Cannot be empty")
	private String parent2;
	@NotNull(message="Cannot be empty")
	private String email;
	@NotNull(message="Cannot be empty")
	private String address;
	@NotNull(message="Cannot be empty")
	private String reason;
	@NotNull(message="Cannot be empty")
	private String funding;
	@NotNull(message="Cannot be empty")
	private String availableDay; 
	@NotNull(message="Cannot be empty")
	private String availableTime;
	@NotNull(message="Cannot be empty")
	private String notes;
	private int ID;
	
	public Client()
	{
		this.timeStamp = "";
		this.firstName = "";
		this.lastName = "";
		this.birthDate = "";
		this.diagnosis = "";
		this.phoneNumber = "";
		this.parent1 = "";
		this.parent2 = "";
		this.email = "";
		this.address = "";
		this.reason = "";
		this.funding = "";
		this.availableDay = "";
		this.availableTime = "";
		this.notes = "";
		this.ID = 0;
	}
	
	public Client(int ID, String timeStamp, String firstName, String lastName, String birthDate, String diagnosis, String phoneNumber, String parent1, String parent2, String email, String address, String reason, String funding, String availableDay, String availableTime, String notes) 
	{
		this.timeStamp = timeStamp;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.parent1 = parent1;
		this.parent2 = parent2;
		this.email = email;
		this.address = address;
		this.reason = reason;
		this.funding = funding;
		this.notes = notes;
		this.ID = ID;
		this.diagnosis = diagnosis;
		this.availableDay = availableDay;
		this.availableTime = availableTime;
	}

	public void reader() throws FileNotFoundException
	{
		int ID = 0;
		ArrayList<Client> people = new ArrayList<Client>();
		BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\ericw\\Downloads\\MOCK_DATA (2).csv"));
		String row;
		try {
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    Client person = new Client(0, data[0], data[1], data[2], data[3], data[4], data[5],data[6], data[7], data[8], data[9], data[10], data[11], data[12], data[13], data[14]);
			    people.add(person);
			    ID++;

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			csvReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		toString(people);

	}

	public static void toString(ArrayList<Client> people)
	{
		for(int i = 0; i < people.size();i++)
		{
			System.out.println(people.get(i));
		}

	}

	public String getTimeStamp() { return timeStamp; }
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getBirthDate() { return birthDate; }
	public String getDiagnosis() { return diagnosis; }
	public String getPhoneNumber() { return phoneNumber; }
	public String getParent1() { return parent1; }
	public String getParent2() { return parent2; }
	public String getEmail() { return email; }
	public String getAddress() { return address; }
	public String getReason() { return reason; }
	public String getFunding() { return funding; }
	public String getAvailableDay() { return availableDay; }
	public String getAvailableTime() { return availableTime; }
	public String getNotes() { return notes; }
	public int getID() { return ID; }

	public void setTimeStamp(String timeStamp) { this.timeStamp = timeStamp; }	
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setBirthDate(String birthDate) { this.birthDate = birthDate; }
	public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
	public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
	public void setParent1(String parent1) { this.parent1 = parent1; }
	public void setParent2(String parent2) { this.parent2 = parent2; }
	public void setEmail(String email) { this.email = email; }
	public void setAddress(String address) { this.address = address; }
	public void setReason(String reason) { this.reason = reason; }
	public void setFunding(String funding) { this.funding = funding; }
	public void setAvailableDay(String availableDay) { this.availableDay = availableDay; }
	public void setAvailableTime(String availableTime) { this.availableTime = availableTime; }
	public void setNotes(String notes) { this.notes = notes; }
	public void setID(int iD) { ID = iD; }

	public String toString()
	{
		return "Client ID: " + ID + "\nName: " + firstName + " " + lastName + "\nTime of entry: " + timeStamp + "\nBirth Date: " + birthDate + "\nDiagnosis: " +  diagnosis + "\nPhone Number: " +  phoneNumber + "\nParent 1: " +  parent1 + "\nParent 2: " + parent2 + "\nEmail Address: " + email + "\nReason: " +  reason + "\nFunding Source: " +  funding + "\nAvailability: " + availableDay + " " + availableTime + "\nNotes: " +  notes + "\n";
	}



}