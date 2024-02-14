package com.hospital.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.db.model.DoctorRegistration;
import com.hospital.db.service.DoctorRegistrationService;
import com.springbootcommonlib.response.Response;
 

@RestController
@RequestMapping("/doctorRegistration")
public class DoctorRegistrationController {
	
	 
	@Autowired
	DoctorRegistrationService doctorRegistrationService;
	
	@PostMapping("add")
	public Response add(@RequestBody DoctorRegistration doctorRegistration) {
		return doctorRegistrationService.add(doctorRegistration);
		
	}
	

}
