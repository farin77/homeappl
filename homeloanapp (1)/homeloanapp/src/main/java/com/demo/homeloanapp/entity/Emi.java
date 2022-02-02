package com.demo.homeloanapp.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Emi {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int emiId;
	
	@Temporal(value=TemporalType.DATE)
private Date dueDate;
	
private double emiAmount;
private double loanAmount;
private double interestAmount;


public Emi() {
	super();
	// TODO Auto-generated constructor stub
}



public Emi(int emiId, Date dueDate, double emiAmount, double loanAmount, double interestAmount) {
	super();
	this.emiId = emiId;
	this.dueDate = dueDate;
	this.emiAmount = emiAmount;
	this.loanAmount = loanAmount;
	this.interestAmount = interestAmount;
}



public int getEmiId() {
	return emiId;
}



public void setEmiId(int emiId) {
	
	this.emiId = emiId;
}



public Date getDueDate() {
	return dueDate;
}



public void setDueDate(Date dueDate) {
	this.dueDate = dueDate;
}



public double getEmiAmount() {
	return emiAmount;
}



public void setEmiAmount(double emiAmount) {
	this.emiAmount = emiAmount;
}



public double getLoanAmount() {
	return loanAmount;
}



public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}



public double getInterestAmount() {
	return interestAmount;
}



public void setInterestAmount(double interestAmount) {
	this.interestAmount = interestAmount;
}



@Override
public String toString() {
	return "Emi [emiId=" + emiId + ", dueDate=" + dueDate + ", emiAmount=" + emiAmount + ", loanAmount=" + loanAmount
			+ ", interestAmount=" + interestAmount + "]";
}






}
