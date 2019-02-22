package com.metacube.shoppingcart.controller;

import com.metacube.shoppingcart.Enum.Status;
import com.metacube.shoppingcart.facade.*;
import com.metacube.shoppingcart.facade.UserFacade;
import com.metacube.shoppingcart.model.User;

public class UserController {

	FactoryFacade factoryfacade= FactoryFacade.getInstance();
	UserFacade userf = factoryfacade.getInstanceOfUserFacade();
	UserCartFacade usercartfacade = factoryfacade.getInstanceOfUserCartFacade();
	
	public static UserController usercontroller;
	public Status addUser(User u) {
		 userf.addUser(u);
		 return Status.ADDED;
		
	}
	public Status changeUser(User u) {
		return usercartfacade.getUser(u);
		
	}
	public static UserController getInstance() {
		 if(usercontroller == null) {
			 usercontroller = new UserController();
		 }
		 return usercontroller;
	 }

}
