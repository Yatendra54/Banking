package com;

public class InsuffientBalance extends RuntimeException {
	
	String message;

	public InsuffientBalance(String message) {
		
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}
	

}
