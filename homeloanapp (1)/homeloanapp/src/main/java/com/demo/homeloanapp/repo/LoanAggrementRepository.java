package com.demo.homeloanapp.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.homeloanapp.entity.LoanAggrement;


 @Repository
public interface LoanAggrementRepository extends JpaRepository<LoanAggrement, Integer> {

}
