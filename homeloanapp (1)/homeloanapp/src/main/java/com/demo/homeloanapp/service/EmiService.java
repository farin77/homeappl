package com.demo.homeloanapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.homeloanapp.entity.Emi;
import com.demo.homeloanapp.repo.EmiRepository;

@Service
public class EmiService {
	@Autowired
	EmiRepository EMIrepository;


	public  Emi getEmiById(int id) {
		Optional<Emi> EMIContainer = EMIrepository.findById(id);

		if (EMIContainer.isPresent()) {

			return EMIContainer.get();

		} else {

			return null;

		}
	}



	public boolean deleteAllEmi() {
		// TODO Auto-generated method stub
		try {

			EMIrepository.deleteAll();

		} catch (Exception e) {

			return false;

		}

		return true;
	}



	public String deleteById(int id) {
		Optional<Emi> EmiContainer = EMIrepository.findById(id);

		if (EmiContainer.isPresent()) {

			Emi oldObj = EmiContainer.get();

			EMIrepository.delete(oldObj);

			return "Deleted Successfully!!!";

		} else {

			return "The specified id is not present in the DB :" + id;

		}
	}



	public  Emi updateEmi(int id, Emi obj) {

		// I have to find the employee object having this id

		Optional<Emi> EMIContainer= EMIrepository.findById(id);

		if (EMIContainer.isPresent()) {

			Emi oldObj = EMIContainer.get();

			oldObj.setDueDate(obj.getDueDate());

			oldObj.setEmiAmount(obj.getEmiAmount());

			oldObj.setLoanAmount(obj.getLoanAmount());

			oldObj.setInterestAmount(obj.getInterestAmount());

			
			

			System.out.println("Successfully Updated!!!!!!");

			return EMIrepository.saveAndFlush(oldObj);

		}

		System.out.println("No object Found with this ID");

		return obj;
}



	public Emi createEmi(Emi emi) {
		// TODO Auto-generated method stub

		return EMIrepository.save(emi);
	}

	

	public List<Emi> getEmi() {
		// TODO Auto-generated method stub
		return EMIrepository.findAll() ;
	}
}
