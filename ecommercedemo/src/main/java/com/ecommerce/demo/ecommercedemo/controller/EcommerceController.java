package com.ecommerce.demo.ecommercedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.ecommercedemo.entity.LoginData;
import com.ecommerce.demo.ecommercedemo.service.EcommerceService;

@RestController
@RequestMapping("/login")
public class EcommerceController {

	@Autowired
	EcommerceService service;

	@PostMapping("/user")
	@CrossOrigin(origins = "http://localhost:4200")
	public LoginData getLoginUser(@RequestBody LoginData data) throws Exception {
		String tempEmailId = data.getUserId();
		String tempPassword = data.getPassword();

		LoginData dataobj = null;
		if (tempEmailId != null && tempPassword != null) {
			dataobj = service.validate(tempEmailId, tempPassword);

		}
		if (dataobj == null) {
			throw new Exception("Wrong username or password");
		}

		return new LoginData(data.getUserId(), null);
	}
}
