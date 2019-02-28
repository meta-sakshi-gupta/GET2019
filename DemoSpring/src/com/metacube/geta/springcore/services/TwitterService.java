package com.metacube.geta.springcore.services;

public class TwitterService implements MessageService
{

	public String sendMessage(String message, String receiver) 
	{
		return ("The " +message+ " is sent to " +receiver);
	}
  
}
