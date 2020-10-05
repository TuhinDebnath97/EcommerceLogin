package com.ecommerce.demo.ecommercedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.ecommercedemo.dao.UserRepository;
import com.ecommerce.demo.ecommercedemo.entity.LoginData;

@Service
public class EcommerceService {

	@Autowired
	UserRepository repo;

	public LoginData validate(String email, String password) {

		return repo.findByUserIdAndPassword(email, password);
	}
}
