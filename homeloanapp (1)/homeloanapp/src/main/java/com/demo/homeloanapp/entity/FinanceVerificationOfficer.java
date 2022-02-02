package com.demo.homeloanapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
@Entity
public class FinanceVerificationOfficer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@NotNull(message="adminName should not be null!!")
	private String finOfficerName;
	
	@Pattern(regexp="(^$|[0-9]{10})",message="contact can only contain 10 digits!!")
	private @Pattern(regexp = "(^$|[0-9]{10})", message = "contact can only contain 10 digits!!") String finOfficerContact;
	
	public FinanceVerificationOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FinanceVerificationOfficer(int userId, String finOfficerName, String finOfficerContact) {
		super();
		this.userId = userId;
		this.finOfficerName = finOfficerName;
		this.finOfficerContact = finOfficerContact;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFinOfficerName() {
		return finOfficerName;
	}
	public void setFinOfficerName(String finOfficerName) {
		this.finOfficerName = finOfficerName;
	}
	public String getFinOfficerContact() {
		return finOfficerContact;
	}
	public void setFinOfficerContact(String finOfficerContact) {
		this.finOfficerContact = finOfficerContact;
	}
	@Override
	public String toString() {
		return "FinanceVerificationOfficer [userId=" + userId + ", finOfficerName=" + finOfficerName
				+ ", finOfficerContact=" + finOfficerContact + "]";
	}
	
	
	
	
}
