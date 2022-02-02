package com.demo.homeloanapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.homeloanapp.entity.FinanceVerificationOfficer;


@Repository
public interface FinVeriOfficerRepository extends JpaRepository<FinanceVerificationOfficer, Integer> {

}
