package com.demo.homeloanapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.homeloanapp.entity.Emi;
import com.demo.homeloanapp.entity.LoanAggrement;
import com.demo.homeloanapp.exception.EMIListIsEmpty;
import com.demo.homeloanapp.exception.EMINotFoundException;
import com.demo.homeloanapp.repo.EmiRepository;
import com.demo.homeloanapp.repo.LoanAggrementRepository;

@Service
public class LoanAgreementService {
	@Autowired
	LoanAggrementRepository loanAggrementRepository;
	
	@Autowired
	EmiRepository emiRepository;
	
	public LoanAggrement createLoanAggrement(LoanAggrement loan) {
		
         List<Emi> emiList=loan.getEmi();
       
         if(emiList.size()>0) {
        	 List<Emi> emiNewList=new ArrayList<>();
        	 System.out.println("The EMI List Size is"+emiList.size());
        	 for(int i=0;i<emiList.size();i++) {
        		 Optional<Emi> emiContainer=emiRepository.findById(emiList.get(i).getEmiId());
        		 if(!(emiContainer.isPresent())) {
        			 
        			 throw new EMINotFoundException("EMI not found");
        		 }else {
        			 emiNewList.add(emiContainer.get());
        		 }
        	 }
        	 
        	loan.setEmi(emiNewList); 
         }else {
        	 throw new EMIListIsEmpty("EMI List is Empty");
         }
		return loanAggrementRepository.save(loan);
	}


	public  LoanAggrement getLoanAggrementById(int id) {
		Optional<LoanAggrement> loanContainer = loanAggrementRepository.findById(id);

		if (loanContainer.isPresent()) {

			return loanContainer.get();

		} else {

			return null;

		}
	}



	public boolean deleteAllLoanAggrement() {
		// TODO Auto-generated method stub
		try {

			loanAggrementRepository.deleteAll();

		} catch (Exception e) {

			return false;

		}

		return true;
	}



	public String deleteById(int id) {
		Optional<LoanAggrement> loanContainer =loanAggrementRepository.findById(id);

		if (loanContainer.isPresent()) {

			LoanAggrement oldObj = loanContainer.get();

			loanAggrementRepository.delete(oldObj);

			return "Deleted Successfully!!!";

		} else {

			return "The specified id is not present in the DB :" + id;

		}
	}



	public LoanAggrement updateLoanAggrement(int id, LoanAggrement obj) {

		// I have to find the employee object having this id

		Optional<LoanAggrement> loanContainer= loanAggrementRepository.findById(id);

		if (loanContainer.isPresent()) {

			LoanAggrement oldObj = loanContainer.get();

			oldObj.setLoanAggrementId(obj.getLoanAggrementId());

			
			oldObj.setEmi(obj.getEmi());

			
			System.out.println("Successfully Updated!!!!!!");

			return loanAggrementRepository.saveAndFlush(oldObj);

		}

		System.out.println("No object Found with this ID");

		return obj;
}



	
	

	public List<LoanAggrement> getLoanAggrement() {
		// TODO Auto-generated method stub
		return loanAggrementRepository.findAll() ;
	}
	
}
