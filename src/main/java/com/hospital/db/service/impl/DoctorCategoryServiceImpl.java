package com.hospital.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.db.model.DoctorCategory;
import com.hospital.db.reposoitory.DoctorCategoryRepository;
import com.hospital.db.service.DoctorCategoryService;
import com.springbootcommonlib.response.Response;

@Service
public class DoctorCategoryServiceImpl implements DoctorCategoryService{

	@Autowired
	DoctorCategoryRepository categoryRepository;
	
	@Override
	public Response add(DoctorCategory doctorCategory) {
		Response response = new Response();

		DoctorCategory addCategory = categoryRepository.save(doctorCategory);
		response.setData(addCategory);
		return response;
	}

	@Override
	public Response update(DoctorCategory doctorCategory){
		Response response = new Response();

		DoctorCategory addCategory = categoryRepository.save(doctorCategory);
		response.setData(addCategory);
		return response;
	}
	
	

}
