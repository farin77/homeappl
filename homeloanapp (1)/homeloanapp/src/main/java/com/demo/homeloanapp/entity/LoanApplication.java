
package com.demo.homeloanapp.entity;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class LoanApplication {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int appliactionId;
	 @Temporal(value=TemporalType.DATE)
	private Date applicationDate;
	private double loanAppliedAmount;
	private double loanApprovedAmount;
	private boolean landVerificationApproval;
	private boolean financeVerificationApproval;
	private boolean adminApproval;
	@Enumerated(value=EnumType.STRING)
	private Status status;
	
	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="CustomerId")
	private Customer customer;
	 
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="AggrementId")
	private LoanAggrement loanAggrement;
	
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public LoanApplication(int appliactionId, Date applicationDate, double loanAppliedAmount,
			double loanApprovedAmount, boolean landVerificationApproval, boolean financeVerificationApproval,
			boolean adminApproval, Status status, Customer customer, LoanAggrement loanAggrement) {
		super();
		this.appliactionId = appliactionId;
		this.applicationDate = applicationDate;
		this.loanAppliedAmount = loanAppliedAmount;
		this.loanApprovedAmount = loanApprovedAmount;
		this.landVerificationApproval = landVerificationApproval;
		this.financeVerificationApproval = financeVerificationApproval;
		this.adminApproval = adminApproval;
		this.status = status;
		this.customer = customer;
		this.loanAggrement = loanAggrement;
	}



	public long getAppliactionId() {
		return appliactionId;
	}
	public void setAppliactionId(int appliactionId) {
		this.appliactionId = appliactionId;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public double getLoanAppliedAmount() {
		return loanAppliedAmount;
	}
	public void setLoanAppliedAmount(double loanAppliedAmount) {
		this.loanAppliedAmount = loanAppliedAmount;
	}
	public double getLoanApprovedAmount() {
		return loanApprovedAmount;
	}
	public void setLoanApprovedAmount(double loanApprovedAmount) {
		this.loanApprovedAmount = loanApprovedAmount;
	}
	public boolean isLandVerificationApproval() {
		return landVerificationApproval;
	}
	public void setLandVerificationApproval(boolean landVerificationApproval) {
		this.landVerificationApproval = landVerificationApproval;
	}
	public boolean isFinanceVerificationApproval() {
		return financeVerificationApproval;
	}
	public void setFinanceVerificationApproval(boolean financeVerificationApproval) {
		this.financeVerificationApproval = financeVerificationApproval;
	}
	public boolean isAdminApproval() {
		return adminApproval;
	}
	public void setAdminApproval(boolean adminApproval) {
		this.adminApproval = adminApproval;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public LoanAggrement getLoanAggrement() {
		return loanAggrement;
	}



	public void setLoanAggrement(LoanAggrement loanAggrement) {
		this.loanAggrement = loanAggrement;
	}



	@Override
	public String toString() {
		return "LoanApplication [appliactionId=" + appliactionId + ", applicationDate=" + applicationDate
				+ ", loanAppliedAmount=" + loanAppliedAmount + ", loanApprovedAmount=" + loanApprovedAmount
				+ ", landVerificationApproval=" + landVerificationApproval + ", financeVerificationApproval="
				+ financeVerificationApproval + ", adminApproval=" + adminApproval + ", status=" + status
				+ ", customer=" + customer + ", loanAggrement=" + loanAggrement + "]";
	}

	
	
}
