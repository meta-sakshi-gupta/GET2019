package com.metacube.get.model;

public class Advertisement extends BaseEntity
{
	private int category_id;
	private String advertisement_title;

	// Constructor to initialize the attributes
	public Advertisement(int category_id, String advertisement_title) 
	{
		this.category_id = category_id;
		this.advertisement_title = advertisement_title;
	}

	// START Getter
	public int getCategory_id() 
	{
		return category_id;
	}

	public String getTitle() 
	{
		return advertisement_title;
	}
	// END Getter
}
