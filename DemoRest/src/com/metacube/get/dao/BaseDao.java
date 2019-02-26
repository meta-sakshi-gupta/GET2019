package com.metacube.get.dao;

import java.util.List;

public interface BaseDao<T>
{
	public List<T> getlist();

	public void insert(T t);

	public void update(T t);

	public void delete(T t);
}
