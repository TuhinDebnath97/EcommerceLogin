package com.ecommerce.demo.ecommercedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.demo.ecommercedemo.entity.LoginData;


@Repository
public interface UserRepository extends JpaRepository<LoginData, String> {


	public LoginData findByUserIdAndPassword(String email, String password);
}
