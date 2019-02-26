package com.metacube.get.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.metacube.get.enums.Status;
import com.metacube.get.facade.CategoryFacade;
import com.google.gson.Gson;
import com.metacube.get.model.Category;

@Path("/CategoryResource")
 public class CategoryResource {
	CategoryFacade categoryfacade = CategoryFacade.getInstance();

	@POST
	@Path("/insertData")
	@Consumes(MediaType.APPLICATION_JSON)
     /**
	 * Function to add category to database
	 * 
	 * @param name
	 * @return
	 */
	public String insertIntoCategories(Category category) {

		System.out.println("out of Demo");
		if (categoryfacade.insertStatus(category) == Status.CREATED) {
			System.out.println("on of Demo");
			return category.getName() + " !! inserted !!";
		}
		return "Duplicate Entry";
	}

	@GET
	@Path("/GetList")
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * Function to get list of category from database
	 * 
	 * @return
	 */
	public String getList() {

    	List<Category> listOfCategory = categoryfacade.getList();
    	System.out.println(listOfCategory);
		Gson gson = new Gson();
		String categorylist = gson.toJson(listOfCategory);
		return categorylist;
	}

	@PUT
	@Path("/Update/{name}/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * Function to update data in the table 
	 * 
	 * @param name
	 * @param id
	 * @return
	 */
	public String updateCategory(@PathParam("name") String name, @PathParam("id") int id) {
       Category category = new Category(name);
		category.setId(id);

		if (categoryfacade.updateStatus(category) == Status.UPDATED) {
			return name + " !!UPDATED!!";
		}
		return "!!NOT UPDATED!!";
	}

	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * Function to delete category by id
	 * 
	 * @param id
	 * @return
	 */
	public String deleteCategoryById(@PathParam("id") int id) {

		if (categoryfacade.deleteStatus(id) == Status.DELETED) {
			return "!!DELETED!!";
		}
		return "!!NOT DELETED!!";
	}
}
