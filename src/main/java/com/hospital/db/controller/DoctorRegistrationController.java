package com.hospital.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping("list")
	public Response list() {
		return doctorRegistrationService.list();
	}
	@PostMapping("findByCategory")
	public Response findByCategory(@RequestParam Integer doctorCategory) {
		return doctorRegistrationService.findByCategory(doctorCategory);
	}
	
	@PostMapping("doctorAvailability")
	public Response doctorAvailability(@RequestParam Integer doctorCategory,boolean dayAvailableStatus) {
		return doctorRegistrationService.doctorAvailability(doctorCategory,dayAvailableStatus);
	}
 
	
}
