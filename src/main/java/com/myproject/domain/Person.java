package com.myproject.domain;

public class Person {
	
	private Long id;
	private String name;
	private String surname;
	private String phoneNumber;
	
	public Person() {}
	
	public Person(Long id, String name, String surname, String phoneNumber) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
