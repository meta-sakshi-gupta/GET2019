package com.metacube.geta.springcore.services;

public class EmailService implements MessageService
{

	public String sendMessage(String message, String receiver) 
	{
		return ("The " +message+" is sent to " +receiver);
	}

}
