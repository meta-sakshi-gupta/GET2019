package com.metacube.get.dao;
import java.util.List;
import com.metacube.get.view.AdvertisementView;

public interface Advertisement extends BaseDao<com.metacube.get.model.Advertisement>
{
	public boolean CheckAdvertisement(String name);

	public List<AdvertisementView> getListById(int category_id);

	public void deleteById(int id);
}
