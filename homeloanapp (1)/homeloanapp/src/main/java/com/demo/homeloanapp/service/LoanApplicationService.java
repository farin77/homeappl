package com.demo.homeloanapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.homeloanapp.entity.Customer;
import com.demo.homeloanapp.entity.LoanAggrement;
import com.demo.homeloanapp.entity.LoanApplication;
import com.demo.homeloanapp.exception.CustomerNotFoundException;
import com.demo.homeloanapp.exception.LoanAggrementNotFoundException;
import com.demo.homeloanapp.repo.CustomerRepository;
import com.demo.homeloanapp.repo.LoanAggrementRepository;
import com.demo.homeloanapp.repo.LoanApplicationRepository;

@Service
public class LoanApplicationService {
	@Autowired
	LoanApplicationRepository loanApplicationRepository;

	@Autowired
	LoanAggrementRepository loanAggrementRepository;
	
	@Autowired 
	CustomerRepository customerRepository;
	
	public LoanApplication createLoanApplication(LoanApplication loanApp) {
		Customer custom=loanApp.getCustomer();
		int customerId=custom.getUserId();
		if(customerId>0) {
			Optional<Customer>	customerContainer=customerRepository.findById(customerId);
			if(customerContainer.isPresent()) {
				
				loanApp.setCustomer(customerContainer.get());
			}else {
				
				throw new CustomerNotFoundException("Customer Not Found");
			}
		}
		LoanAggrement loanAgg = loanApp.getLoanAggrement();
		long loanAggrementId=loanAgg.getLoanAggrementId();
		if(loanAggrementId>0)
		{
			Optional<LoanAggrement> loanAggrementContainer=loanAggrementRepository.findById((int) loanAggrementId);
			if(loanAggrementContainer.isPresent())
			{
				loanApp.setLoanAggrement(loanAggrementContainer.get());
			}
			else
			{
				throw new LoanAggrementNotFoundException("LoanAggrement not found");
			}
		}
		return loanApplicationRepository.save(loanApp);
		
		
		
	}

	
	
	public  LoanApplication getLoanApplicationById(int id) {
		Optional<LoanApplication> customerContainer = loanApplicationRepository.findById(id);

		if (customerContainer.isPresent()) {

			return customerContainer.get();

		} else {

			return null;

		}
	}



	public boolean deleteAllLoanApplication() {
		// TODO Auto-generated method stub
		try {

			loanApplicationRepository.deleteAll();

		} catch (Exception e) {

			return false;

		}

		return true;
	}



	public String deleteById(int id) {
		Optional<LoanApplication> customerContainer = loanApplicationRepository.findById(id);

		if (customerContainer.isPresent()) {

			LoanApplication oldObj = customerContainer.get();

			loanApplicationRepository.delete(oldObj);

			return "Deleted Successfully!!!";

		} else {

			return "The specified id is not present in the DB :" + id;

		}
	}



	public LoanApplication updateLoanApplication(int id, LoanApplication obj) {

		// I have to find the employee object having this id

		Optional<LoanApplication> adminContainer= loanApplicationRepository.findById(id);

		if (adminContainer.isPresent()) {

			LoanApplication oldObj = adminContainer.get();

			oldObj.setApplicationDate(obj.getApplicationDate());
			oldObj.setLoanAppliedAmount(obj.getLoanAppliedAmount());
			oldObj.setLoanApprovedAmount(obj.getLoanApprovedAmount());
			oldObj.setFinanceVerificationApproval(obj.isFinanceVerificationApproval());
			oldObj.setLandVerificationApproval(obj.isLandVerificationApproval());
			oldObj.setAdminApproval(obj.isAdminApproval());
			oldObj.setStatus(obj.getStatus());
			oldObj.setCustomer(obj.getCustomer());
			oldObj.setLoanAggrement(obj.getLoanAggrement());
			
			System.out.println("Successfully Updated!!!!!!");

			return loanApplicationRepository.saveAndFlush(oldObj);

		}

		System.out.println("No object Found with this ID");

		return obj;
}



	public List<LoanApplication> getLoanApplication() {
		// TODO Auto-generated method stub
		return loanApplicationRepository.findAll() ;
	}
	
}
