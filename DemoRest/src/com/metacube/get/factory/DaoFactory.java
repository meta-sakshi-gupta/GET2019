package com.metacube.get.factory;

import com.metacube.get.dao.BaseDao;
import com.metacube.get.dao.MYSQLAdvertisement;
import com.metacube.get.dao.MYSQLCategory;
import com.metacube.get.enums.DBType;
import com.metacube.get.enums.EntityName;

public class DaoFactory 
{
	@SuppressWarnings("rawtypes")
	public static BaseDao getDaoForEntity(EntityName entityName, DBType dbType) 
	{
		BaseDao basedao = null;
		switch (entityName)
		{
		case CATEGORY:
			switch (dbType) 
			{
			case MY_SQL:
				basedao = MYSQLCategory.getInstance();
			case IN_MEMORY:
				break;
			default:
				break;
			}
			break;

		case ADVERTISEMENT:
			switch (dbType) 
			{
			case MY_SQL:
				basedao = MYSQLAdvertisement.getInstance();
			case IN_MEMORY:
				break;
			default:
				break;
			}
			break;
		}
		return basedao;
	}
}
