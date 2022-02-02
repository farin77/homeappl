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

import com.demo.homeloanapp.entity.Emi;
import com.demo.homeloanapp.service.EmiService;

@RestController
public class EMIController {

@Autowired
        EmiService  emiService ;

	@PostMapping("/EMI")

	public Emi createEMI(@Valid @RequestBody Emi emi) {

		return emiService.createEmi(emi);

	}

	@GetMapping("/EMI")
	 public List<Emi> getEMI(){

	 return emiService.getEmi();

	}


	@GetMapping("/EMI/{id}")

	public Emi getEMIById(@PathVariable int id) {

		return emiService.getEmiById(id);

	}

	@DeleteMapping("/EMI")

	public boolean deleteAllEMI() {

		return emiService.deleteAllEmi();

	}

	@DeleteMapping("/EMI/{id}")

	public String deleteById(@PathVariable int id) {

		return emiService.deleteById(id);

	}

//http://localhost:8090/employees/4

	@PutMapping("/EMI/{id}")

	public Emi updateEMI(@PathVariable int id, @RequestBody Emi obj) {

		return emiService.updateEmi(id, obj);

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
