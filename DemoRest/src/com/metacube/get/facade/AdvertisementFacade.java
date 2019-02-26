package com.metacube.get.facade;

import java.util.List;

import com.metacube.get.dao.Advertisement;
import com.metacube.get.enums.DBType;
import com.metacube.get.enums.EntityName;
import com.metacube.get.factory.DaoFactory;
import com.metacube.get.view.AdvertisementView;
import com.metacube.get.enums.Status;

public class AdvertisementFacade 
{
	static AdvertisementFacade advertisement = new AdvertisementFacade();

	Advertisement advertisementdao = (Advertisement) DaoFactory.getDaoForEntity(EntityName.ADVERTISEMENT, DBType.MY_SQL);

	public static AdvertisementFacade getInstance() 
	{
		return advertisement;
	}

	/**
	 * Function to return the insert status of the Category
	 * 
	 * @param category
	 * @return
	 */
	public Status insertStatus(com.metacube.get.model.Advertisement advertisement) 
	{
		boolean status = advertisementdao.CheckAdvertisement(advertisement.getTitle());

		if (status) 
		{
			return Status.DUPLICATE;
		}

		advertisementdao.insert(advertisement);
		return Status.CREATED;
	}

	/**
	 * Function to return the update status of the Category
	 * 
	 * @param category
	 * @return
	 */
	public Status updateStatus(com.metacube.get.model.Advertisement advertisement) 
	{

		advertisementdao.update(advertisement);
		return Status.UPDATED;
	}

	/**
	 * Function to get the List of category
	 * 
	 * @param category
	 * @return
	 */
	public List<com.metacube.get.model.Advertisement> getList() 
	{
		List<com.metacube.get.model.Advertisement> listOfCategory = advertisementdao.getlist();
		return listOfCategory;
	}

	/**
	 * Function to get list of advertisement by id
	 * 
	 * @param id
	 * @return
	 */
	public List<AdvertisementView> getListById(int id) 
	{
		List<AdvertisementView> listOfAdvertisement = advertisementdao.getListById(id);

		return listOfAdvertisement;
	}

	/**
	 * Function to delete the advertisement
	 * 
	 * @param advertisement
	 * @return status
	 */
	public Status deleteStatus(int id) 
	{

		advertisementdao.deleteById(id);
		return Status.DELETED;

	}
}
