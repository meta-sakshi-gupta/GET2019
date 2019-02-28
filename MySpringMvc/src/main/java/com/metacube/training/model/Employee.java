package com.metacube.training.model;

public class Employee {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String contact;
	
    public Employee() {
	}

	public Employee(Long id, String firstName, String lastName, String email , String contact) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", contact=" + contact+"]";
	}
	
	

}
