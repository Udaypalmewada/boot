package com.boot.web.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable{
	@OneToOne
	private RegistrationEntity  registrationEntity;
	
	
	
	@Id
protected int id;	
protected String line1;
protected String city;
protected String country;
protected int zipid;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getZipid() {
	return zipid;
}
public void setZipid(int zipid) {
	this.zipid = zipid;
}
public String getLine1() {
	return line1;
}
public void setLine1(String line1) {
	this.line1 = line1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}


}
