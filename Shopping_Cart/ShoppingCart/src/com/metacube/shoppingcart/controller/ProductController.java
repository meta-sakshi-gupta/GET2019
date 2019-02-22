package com.metacube.shoppingcart.controller;
import java.util.List;

import com.metacube.shoppingcart.model.*;
import com.metacube.shoppingcart.Enum.*;
import com.metacube.shoppingcart.facade.*;

public class ProductController {
	FactoryFacade factoryfacade= FactoryFacade.getInstance();
	ProductFacade pf = factoryfacade.getInstanceOfProductFacade();
	public static ProductController productcontroller;

	public Status addProductInCart(Product p) {
		return (pf.addProduct(p));	
	}

public List<Product> getListOfProducts() {
	return pf.getAll();
}
 public static ProductController getInstance() {
	 if(productcontroller == null) {
		 productcontroller = new ProductController();
	 }
	 return productcontroller;
 }
}
