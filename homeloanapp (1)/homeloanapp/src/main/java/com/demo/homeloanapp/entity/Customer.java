package com.demo.homeloanapp.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userId;
	
	@NotNull(message="Customer_name should not be null!!")
	
private String customerName;
	
	@Pattern(regexp="(^$|[0-9]{10})",message="contact can only contain 10 digits!!")
private String mobileNumber;
	@Email
	@NotBlank(message = "Email is mandatory")
private String emailId;
	 @Temporal(value=TemporalType.DATE)
	
private Date dateOfBirth;
	 
	 @Enumerated(value=EnumType.STRING)
private Gender gender;
	 
	 @NotNull(message="Nationality should not be null!!")
	
private String nationality;
	 
private String aadharNumber;
	 
	 @Pattern( regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}")
private String panNumber;

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(int userId, String customerName, String mobileNumber, String emailId, Date dateOfBirth,
		Gender gender, String nationality, String aadharNumber, String panNumber) {
	super();
	this.userId = userId;
	this.customerName = customerName;
	this.mobileNumber = mobileNumber;
	this.emailId = emailId;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	this.nationality = nationality;
	this.aadharNumber = aadharNumber;
	this.panNumber = panNumber;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public String getNationality() {
	return nationality;
}

public void setNationality(String nationality) {
	this.nationality = nationality;
}

public String getAadharNumber() {
	return aadharNumber;
}

public void setAadharNumber(String aadharNumber) {
	this.aadharNumber = aadharNumber;
}

public String getPanNumber() {
	return panNumber;
}

public void setPanNumber(String panNumber) {
	this.panNumber = panNumber;
}

@Override
public String toString() {
	return "Customer [userId=" + userId + ", customerName=" + customerName + ", mobileNumber=" + mobileNumber
			+ ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", nationality="
			+ nationality + ", aadharNumber=" + aadharNumber + ", panNumber=" + panNumber + "]";
}



	
}
