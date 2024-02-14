package com.hospital.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.db.model.DoctorCategory;
import com.hospital.db.reposoitory.DoctorCategoryRepository;
import com.hospital.db.service.DoctorCategoryService;
import com.hospital.db.service.DoctorRegistrationService;
import com.springbootcommonlib.response.Response;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/doctorCategory")
public class DoctorCategoryController {
	
	@Autowired
	DoctorCategoryService  doctorCategoryService;   
	
	@PostMapping("add")
	public Response add(@RequestBody DoctorCategory doctorCategory) {
		return doctorCategoryService.add(doctorCategory);
	}
	
	@PostMapping("update")
	public Response update(@RequestBody DoctorCategory doctorCategory) {
		return doctorCategoryService.update(doctorCategory);
	}
	

}
