package com.hospital.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.db.model.PatientRegistration;
import com.hospital.db.service.RegistrationService;


@RestController
@RequestMapping("/registration")
public class RegistrationController {
	@Autowired
	private RegistrationService regService;
	
	@PostMapping("save")
	public ResponseEntity<PatientRegistration> savepatientdetails(@RequestBody PatientRegistration patientdetails){
		PatientRegistration savedpatientdetails=regService.SavePatient(patientdetails);
		
		return new ResponseEntity<>(savedpatientdetails, HttpStatus.CREATED);
	}

}
