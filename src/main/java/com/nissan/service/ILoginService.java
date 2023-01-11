package com.nissan.service;

import java.util.List;

import com.nissan.common.APIResponse;
import com.nissan.dto.LoginDTO;
import com.nissan.dto.SignUpDTO;
import com.nissan.model.UserRegistration;

public interface ILoginService {

	// SignUp
	APIResponse signUp(SignUpDTO signUpDTO);

	// Login
	APIResponse login(LoginDTO loginDTO);
	
	//get all users
	List<UserRegistration> getAllUsersList();
	
}
