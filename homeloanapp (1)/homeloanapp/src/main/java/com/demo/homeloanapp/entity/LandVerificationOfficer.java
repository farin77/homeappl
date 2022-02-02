package com.demo.homeloanapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
public class LandVerificationOfficer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@NotNull(message="adminName should not be null!!")
	
	@Length(min=2,message="ItemName Length should not be 0!!")
	private String officerName;
	
	@Pattern(regexp="(^$|[0-9]{10})",message="contact can only contain 10 digits!!")
	private @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") String officerContact;
	public LandVerificationOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LandVerificationOfficer(int userId, String officerName, String officerContact) {
		super();
		this.userId = userId;
		
		
		this.officerName = officerName;
		
		
		this.officerContact = officerContact;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getOfficerName() {
		return officerName;
	}
	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}
	public String getOfficerContact() {
		return officerContact;
	}
	public void setOfficerContact(String officerContact) {
		this.officerContact = officerContact;
	}
	@Override
	public String toString() {
		return "LandVerificationOfficer [userId=" + userId + ", officerName=" + officerName + ", officerContact="
				+ officerContact + "]";
	}
	
	
	
	
}
