package com.patience.mamacare.model;

import java.io.Serializable;

//the word serializable packages the code to be available/accessible by the database and fit in it
//comparable sorts the names in alphabetical order
@SuppressWarnings("serial")
public class Woman implements Serializable, Comparable<Woman> {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String firstName;
private String lastName;
private int age;
private String address;
private int id;

public Woman(int id,String firstName,String lastName,int age,String address){
	this.firstName = firstName;
	this.lastName = lastName;	
	this.age = age;
	this.address = address;
	this.id = id;
}
//getters and setters, shortcut to put them  is right click,source then generate getters and setters
public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public int compareTo(Woman woman) {
	// TODO Auto-generated method stub
	//order to start with lastname 
	return this.lastName.compareToIgnoreCase(woman.getLastName());
}


}