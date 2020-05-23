package com.boot.intializer.model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

  public class Student implements Serializable {
	@Id
	@NotNull
	private int rollnumber;
	@NotEmpty @Size(max=20,min=3)
	private String name;
	@NotEmpty
	private String branch;
	@NotEmpty
	private String semester;
	@Email
	@NotEmpty
	private String email;
	@NotEmpty
	private String contect;
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContect() {
		return contect;
	}
	public void setContect(String contect) {
		this.contect = contect;
	}

}
