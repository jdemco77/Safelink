package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String userName;
	
	@NotNull
	private String password;
	
	@NotNull
	private String fname;
	
	@NotNull
	private String lname;
	
	@NotNull
	private String address;
	
	@NotNull
	private String emergencyContact;
	
	private boolean verified=false;
	
	public boolean isLoggedin() {
		return loggedin;
	}



	public void setLoggedin(boolean loggedin) {
		this.loggedin = loggedin;
	}

	private boolean loggedin=false;

	public double getId() {
		return id;
	}

	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public User() {
		super();
	}
	public User( String username, String password, String fname, String lname, String address,
			String emergencyContact) {
		super();
		
		this.userName = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.emergencyContact = emergencyContact;
	}
	
	
	
	
}
