package eTicaretSistemi.entities.concretes;

import eTicaretSistemi.entities.abstracts.Entity;

public  class User implements Entity {
	
	private int id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private boolean isVerified;
	
	
	public User() {}
	
	public User(int id, String name, String surname, String email, String password, boolean isVerified) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.isVerified = isVerified;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}


	

	
	
	
	
}
