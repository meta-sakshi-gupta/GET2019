package com.metacube.geta.springcore.consumer;

import org.springframework.stereotype.Component;

import com.metacube.geta.springcore.services.MessageService;

@Component
public class MyXMLApplication 
{
  MessageService messageService = null;
  
    //constructor-based dependency injection
	public MyXMLApplication(MessageService messageService) 
	{
		this.messageService = messageService;
	}

	 public boolean sendMessage(String message,String receiver)
	 {
		 String acceptedNotification = "The " + message + " is sent to " + receiver;
		 System.out.println(acceptedNotification);
		 System.out.println(messageService.sendMessage(message, receiver));
		 if(acceptedNotification.equals(messageService.sendMessage(message, receiver)))
		 {
			 return true;
		 }
		 
		 return false;
	 }
	
}
