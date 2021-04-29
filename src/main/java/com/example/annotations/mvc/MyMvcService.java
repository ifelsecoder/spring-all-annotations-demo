package com.example.annotations.mvc;

import com.example.annotations.dto.LoginDto;
import com.example.annotations.dto.LoginLombokDto;
import com.example.annotations.util.MyLogger;

import org.springframework.stereotype.Service;


@Service
public class MyMvcService {

	private static final String ANNOTATIONS = " [ANNOTATIONS:  " +
													"@Service" +
												"]";

	public void authenticate(LoginDto dto) {
		MyLogger.log("MyMvcService, authenticate - called" + ANNOTATIONS);
		MyLogger.log("MyMvcService, authenticate - username: " + dto.getUsername() + ", password: " + dto.getPassword());
	}

	public void authenticateByLombok(LoginLombokDto dto) {
		MyLogger.log("MyMvcService, authenticateByLombok - called" + ANNOTATIONS);
		MyLogger.log("MyMvcService, authenticateByLombok - LoginLombokDto: " + dto + LoginLombokDto.ANNOTATIONS);
	}
}
