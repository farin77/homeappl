package com.demo.homeloanapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
@Entity
@Table(name="usser")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_user") 
 private int userId;
	
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$",message="at least 8 characters and at most 20 characters,at least one digit.\r\n"
			+ "at least one upper case alphabet.\r\n"
			+ "at least one lower case alphabet.\r\n"
			+ "at least one special character which includes !@#$%&*()-+=^.!!")
 private String password;
	
@Enumerated(value=EnumType.STRING)
 private Role role;

public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String password, Role role) {
	super();
	this.userId = userId;
	this.password = password;
	this.role = role;
}
public int getuId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", password=" + password + ", role=" + role + "]";
}
 
 
	
}
