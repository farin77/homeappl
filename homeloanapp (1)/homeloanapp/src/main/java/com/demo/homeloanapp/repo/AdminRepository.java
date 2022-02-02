package com.demo.homeloanapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.homeloanapp.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	

}