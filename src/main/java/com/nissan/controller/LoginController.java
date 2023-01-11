package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.common.APIResponse;
import com.nissan.dto.LoginDTO;
import com.nissan.dto.SignUpDTO;
import com.nissan.model.UserRegistration;
import com.nissan.service.ILoginService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class LoginController {

	@Autowired
	private ILoginService loginService;

	// signUp
	@PostMapping("signup")
	public APIResponse signUp(@RequestBody SignUpDTO signUpDTO) {

		APIResponse apiResponse = loginService.signUp(signUpDTO);

		return apiResponse;
	}

	@PostMapping("login")
	public APIResponse login(@RequestBody LoginDTO loginDTO) {

		APIResponse apiResponse = loginService.login(loginDTO);

		return apiResponse;
	}
	
	@GetMapping("users")
	public List<UserRegistration> getAllUsersList() {
		return loginService.getAllUsersList();
	}
}
