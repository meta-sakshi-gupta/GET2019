package com.metacube.training.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.metacube.training.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {

		Employee project = new Employee();
		project.setId(resultSet.getLong("id"));
		project.setfirstName(resultSet.getString("FIRST_NAME"));
		project.setlastName(resultSet.getString("LAST_NAME"));
		project.setEmail(resultSet.getString("EMAIL"));
		project.setContact(resultSet.getString("CONTACT"));
		
		return project;
	}
}
