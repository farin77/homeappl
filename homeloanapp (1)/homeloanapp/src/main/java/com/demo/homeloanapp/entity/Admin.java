package com.demo.homeloanapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userId;
	
	@NotNull(message="adminName should not be null!!")
private String adminName;
	
	@Pattern(regexp="(^$|[0-9]{10})",message="contact can only contain 10 digits!!")
private @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") String adminContact;
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public Admin(int userId, String adminName, @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") String adminContact) {
	super();
	this.userId = userId;
	this.adminName = adminName;
	this.adminContact = adminContact;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") String getAdminContact() {
	return adminContact;
}
public void setAdminContact(@Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") String adminContact) {
	this.adminContact = adminContact;
}
@Override
public String toString() {
	return "Admin [userId=" + userId + ", adminName=" + adminName + ", adminContact=" + adminContact + "]";
}


}
