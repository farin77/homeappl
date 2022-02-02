package com.demo.homeloanapp.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.demo.homeloanapp.entity.LoanAggrement;

import com.demo.homeloanapp.service.LoanAgreementService;

@RestController
public class LoanAggrementController {


@Autowired
LoanAgreementService  loanAgreementService ;

	@PostMapping("/loanaggrement")

	public LoanAggrement createLoanAggrement(@Valid @RequestBody LoanAggrement loan) {

		return loanAgreementService.createLoanAggrement(loan);

	}

	@GetMapping("/loanaggrement")
	 public List<LoanAggrement> getLoanAggrement(){

	 return loanAgreementService.getLoanAggrement();

	}


	@GetMapping("/loanaggrement/{id}")

	public LoanAggrement getLoanAggrementById(@PathVariable int id) {

		return loanAgreementService.getLoanAggrementById(id);

	}

	@DeleteMapping("/loanaggrement")

	public boolean deleteAllLoanAggrement() {

		return loanAgreementService.deleteAllLoanAggrement();

	}

	@DeleteMapping("/loanaggrement/{id}")

	public String deleteById(@PathVariable int id) {

		return loanAgreementService.deleteById(id);

	}

//http://localhost:8090/employees/4

	@PutMapping("/loanaggrement/{id}")

	public LoanAggrement updateLoanAggrement(@PathVariable int id, @RequestBody LoanAggrement obj) {

		return loanAgreementService.updateLoanAggrement(id, obj);

	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)

	 @ExceptionHandler(MethodArgumentNotValidException.class)

	 public Map<String, String> handleValidationExceptions(

	   MethodArgumentNotValidException ex) {

	     Map<String, String> errors = new HashMap<>();

	     ex.getBindingResult().getAllErrors().forEach((error) -> {

	         String fieldName = ((FieldError) error).getField();

	         String errorMessage = error.getDefaultMessage();

	         errors.put(fieldName, errorMessage);

	    });

	     return errors;

	}
	
	
}
