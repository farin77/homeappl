package com.demo.homeloanapp.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.homeloanapp.entity.User;


 @Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}