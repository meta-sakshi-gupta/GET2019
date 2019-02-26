package com.metacube.get.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.metacube.get.facade.CategoryFacade;
import com.metacube.get.view.AdvertisementView;

public class MYSQLAdvertisement implements Advertisement
{
	public static MYSQLAdvertisement advertisement = new MYSQLAdvertisement();

	CategoryFacade categoryfacade = CategoryFacade.getInstance();

	public static MYSQLAdvertisement getInstance() 
	{
		return advertisement;
	}

	Connection connection;

	@Override
	public List<com.metacube.get.model.Advertisement> getlist() 
	{
		List<com.metacube.get.model.Advertisement> listOfAdvertisement = new ArrayList<com.metacube.get.model.Advertisement>();

		String selectQuery = "SELECT * FROM advertisement";

		connection = ConnectionFactory.getConnection();

		try 
		{
			PreparedStatement statement = connection.prepareStatement(selectQuery);

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) 
			{
				int id = resultSet.getInt("id");
				int category_id = resultSet.getInt("category_id");
				String name = resultSet.getString("advertisement_title");

				com.metacube.get.model.Advertisement advertisement = new com.metacube.get.model.Advertisement(category_id, name);
				advertisement.setId(id);

				listOfAdvertisement.add(advertisement);
			}

			connection.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listOfAdvertisement;
	}

	@Override
	public void insert(com.metacube.get.model.Advertisement t) 
	{
		String insertQuery = "INSERT INTO advertisement(category_id,advertisement_title)VALUES(?,?) ";

		connection = ConnectionFactory.getConnection();

		try 
		{
			PreparedStatement statement = connection.prepareStatement(insertQuery);

			statement.setInt(1, t.getCategory_id());

			statement.setString(2, t.getTitle());

			statement.executeUpdate();

			connection.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void update(com.metacube.get.model.Advertisement t)
	{
		String updateQeury = "UPDATE advertisement SET advertisement_title=? WHERE id='"
				+ t.getId() + "' ";

		connection = ConnectionFactory.getConnection();

		try 
		{
			PreparedStatement statement = connection.prepareStatement(updateQeury);

			statement.setString(1, t.getTitle());

			statement.executeUpdate();

			connection.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(com.metacube.get.model.Advertisement t) 
	{
		// code for delete will come here with any attribute
	}

	@Override
	public boolean CheckAdvertisement(String advertisement_title) 
	{
		boolean status = false;
		String checkQuery = "SELECT * FROM advertisement WHERE  advertisement_title = '"
				+ advertisement_title + "'";

		connection = ConnectionFactory.getConnection();
		try
		{
			PreparedStatement statement = connection.prepareStatement(checkQuery);

			ResultSet result = statement.executeQuery();

			if (result.next()) 
			{
				status = true;
			}

		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public List<AdvertisementView> getListById(int category_id) 
	{
		List<AdvertisementView> listOfAdvertisement = new ArrayList<>();
		String selectQuery = "SELECT advertisement_title FROM advertisement WHERE category_id = '"
				+ category_id + "'";

		connection = ConnectionFactory.getConnection();

		try 
		{
			PreparedStatement statement = connection.prepareStatement(selectQuery);

			ResultSet result = statement.executeQuery();

			while (result.next()) 
			{
				String advertisement_title = result.getString("advertisement_title");

				AdvertisementView advertisement = new AdvertisementView(advertisement_title);

				listOfAdvertisement.add(advertisement);
			}

			connection.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listOfAdvertisement;
	}

	@Override
	public void deleteById(int id) 
	{
		String deleteQuery = "DELETE FROM advertisement WHERE id='"+id+"' ";

		connection = ConnectionFactory.getConnection();
		
		try 
		{
			PreparedStatement statement = connection.prepareStatement(deleteQuery);
			
			statement.executeUpdate();
			
			connection.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
