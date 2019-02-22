package com.metacube.shoppingcart.dao;
import java.util.List;

import com.metacube.shoppingcart.model.*;
import com.metacube.shoppingcart.Enum.*;

  public interface BaseDao {
	public Status addProduct(Product p);
	public Status deleteProduct(Product p);
	public Status updateProduct(Product p);
	public List<Product> getAllProductList();

}
