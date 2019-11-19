package com.model;

/**
 * @author Ruben Cerrato
 *
 * @param <T> Represents the specific object that is being passed in the DTO.
 */
public class DTO<T> 
{
	private int rowCount;
	private String message;
	private T data;
	
	public DTO(int rowCount, String message, T data) 
	{
		this.rowCount = rowCount;
		this.message = message;
		this.data = data;
	}

	public int getRowCount() { return rowCount; }
	public String getMessage() { return message; }
	public T getData() { return data; }

	public void setRowCount(int rowCount) { this.rowCount = rowCount; }
	public void setMessage(String message) { this.message = message; }
	public void setData(T data) { this.data = data; }
	
	
}
