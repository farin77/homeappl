package com.demo.homeloanapp.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class LoanAggrement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int loanAggrementId;
	


@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="EMI_CLM")
private List<Emi> emi;

public LoanAggrement() {
	super();
	// TODO Auto-generated constructor stub
}

public LoanAggrement(int loanAggrementId,  List<Emi> emi) {
	super();
	this.loanAggrementId = loanAggrementId;
	
	this.emi = emi;
}

public int getLoanAggrementId() {
	return loanAggrementId;
}
public void setLoanAggrementId(int loanAggrementId) {
	this.loanAggrementId = loanAggrementId;
}


public List<Emi> getEmi() {
	return emi;
}

public void setEmi(List<Emi> emi) {
	
	this.emi = emi;
}

@Override
public String toString() {
	return "LoanAggrement [loanAggrementId=" + loanAggrementId + " emi="
			+ emi + "]";
}


}
