package com.video.uploader.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
//@NamedQueries({
//	@NamedQuery(name="User.getCities",query= "SELECT DISTINCT w.city FROM Weather w"),
//	@NamedQuery(name="Weather.getWeather",query= "SELECT w FROM Weather w where w.city=:pCity")
//})
public class User {
	@Id
	String id;
	
	@Column
	String logInId;
	
	@Column
	String email;

	@Column
	String password;
	
	public User() {
		id=UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogInId() {
		return logInId;
	}

	public void setLogInId(String logInId) {
		this.logInId = logInId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
