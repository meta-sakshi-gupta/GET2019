package com.metacube.shoppingcart.facade;



import com.metacube.shoppingcart.dao.*;
import com.metacube.shoppingcart.model.User;

public class UserFacade {
	FactoryDao factorydao = FactoryDao.getInstanceFactoryDao();
	UserDao userdao=factorydao.getInstanceOfUserDao();
	public static UserFacade userfacade;
	public void addUser(User u) {
		userdao.addUser(u);		
	}
	public static UserFacade getInstance(){
		if(userfacade == null) {
			userfacade = new UserFacade(); 
		}
		return userfacade;

	}
	
}
