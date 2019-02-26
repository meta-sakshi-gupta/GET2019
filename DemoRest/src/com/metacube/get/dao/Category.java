package com.metacube.get.dao;

public interface Category extends BaseDao<com.metacube.get.model.Category>
{
	public boolean CheckCategory(String name);
		
	public void deleteById(int id);
}
