package com.metacube.geta.springcore.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.metacube.geta.springcore.services.MessageService;

@Component
public class MyApplication 
{
  MessageService messageService = null;	
  
    //constructor-based dependency injection
  
    @Autowired
	public MyApplication(MessageService messageService) 
	{
		this.messageService = messageService;
	}
	
    public Boolean sendMessage(String message,String receiver)
    {
	   String acceptedNotification = "The " + message + " is sent to " + receiver;
		 if(acceptedNotification.equals(messageService.sendMessage(message, receiver)))
		 {
			 return true;
		 }
		 
		 return false;
	 }
}
