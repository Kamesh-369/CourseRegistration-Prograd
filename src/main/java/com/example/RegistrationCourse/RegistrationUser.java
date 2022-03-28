package com.example.RegistrationCourse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrationUser
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstname;
	private String lastname;
	private String phone;
	private String password;
	private String email;
	
	
	public RegistrationUser()
	{
		
	}
	
	
	public RegistrationUser(String firstname, String lastname, String phone, String password, String email) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.password = password;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}