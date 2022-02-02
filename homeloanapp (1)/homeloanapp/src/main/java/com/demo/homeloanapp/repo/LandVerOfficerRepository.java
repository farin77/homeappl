package com.demo.homeloanapp.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.homeloanapp.entity.LandVerificationOfficer;


 @Repository
public interface LandVerOfficerRepository extends JpaRepository<LandVerificationOfficer, Integer> {

}
