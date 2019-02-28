package com.metacube.geta.springcore.test;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.metacube.geta.springcore.configuration.DIConfiguration;
import com.metacube.geta.springcore.consumer.MyApplication;
import com.metacube.geta.springcore.consumer.MyXMLApplication;

public class SpringCoreTest 
{

	ApplicationContext contextAuto= new AnnotationConfigApplicationContext(DIConfiguration.class);
	ApplicationContext contextXML= new ClassPathXmlApplicationContext("com/metacube/geta/springcore/configuration/applicationContext.xml");
	
	@Test
	public  void testEmailWithAnnotation()
	{
		MyApplication myApplication = (MyApplication) contextAuto.getBean("appEmail");
		assertEquals(true, myApplication.sendMessage("email with Annotation bean", "User"));  
	}
	
	@Test
	public  void testEmailWithXml()
	{
		MyXMLApplication myXMLApplication = (MyXMLApplication) contextXML.getBean("appEmail");
		assertEquals(true, myXMLApplication.sendMessage("email with XML bean", "User"));  
	}
	
	@Test
	public void testTwitterWithAnnotation() 
	{
		MyApplication myApplication = (MyApplication) contextAuto.getBean("appTwitter");
		assertEquals(true, myApplication.sendMessage("twitter with Annotation bean", "User"));  
	}
	
	@Test
	public void testTwitterWithXml() 
	{
		MyXMLApplication myXMLApplication = (MyXMLApplication) contextXML.getBean("appTwitter");
		assertEquals(true, myXMLApplication.sendMessage("twitter with XML bean", "User"));  
	}

}
