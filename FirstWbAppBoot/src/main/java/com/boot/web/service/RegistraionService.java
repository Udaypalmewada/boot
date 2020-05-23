package com.boot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.web.entity.RegistrationEntity;
import com.boot.web.repositry.RegistrationRepositry;

@Service
public class RegistraionService{
	@Autowired
	RegistrationRepositry registrationRepositry;
public void saveUser(RegistrationEntity entity) {
	registrationRepositry.save(entity);
	
}

}
