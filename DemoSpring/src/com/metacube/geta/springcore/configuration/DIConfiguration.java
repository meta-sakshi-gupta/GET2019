package com.metacube.geta.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.metacube.geta.springcore.consumer.MyApplication;
import com.metacube.geta.springcore.services.EmailService;
import com.metacube.geta.springcore.services.MessageService;
import com.metacube.geta.springcore.services.TwitterService;

@Configuration
public class DIConfiguration 
{
  @Bean
  public MyApplication appEmail(MessageService email)
  {
	  return new MyApplication(email);
  }
  
  @Bean
  public MyApplication appTwitter(MessageService twitter)
  {
	  return new MyApplication(twitter);
  }
  
  @Bean
  public MessageService email()
  {
	  return (MessageService)new EmailService(); 
  }
  
  public MessageService twitter()
  {
	  return (MessageService)new TwitterService(); 
  }
  
}
