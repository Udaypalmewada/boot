package com.boot.web.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="registationTable")
public class RegistrationEntity implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
protected int id;
protected String name;
protected String lastname;
protected int age;
protected String qualification;
protected String mo_no;
protected String email;

@OneToOne
 private Address address;

public RegistrationEntity(String name2, String lastname2, int age2, String qualification2, String mo_no2,
		String email2) {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getMo_no() {
	return mo_no;
}
public void setMo_no(String mo_no) {
	this.mo_no = mo_no;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "RegistrationEntity [id=" + id + ", name=" + name + ", lastname=" + lastname + ", age=" + age
			+ ", qualification=" + qualification + ", mo_no=" + mo_no + ", email=" + email + ", address=" + address
			+ "]";
}

}
