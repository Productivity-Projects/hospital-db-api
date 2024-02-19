package com.hospital.db.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.db.model.DoctorRegistration;
import com.hospital.db.reposoitory.DoctorRegistrationRepository;
import com.hospital.db.service.DoctorRegistrationService;
import com.springbootcommonlib.response.Response;

@Service
public class DoctorRegistrationServiceImpl implements DoctorRegistrationService {

	@Autowired
	DoctorRegistrationRepository doctorRegistrationRepository;

	@Override
	public Response add(DoctorRegistration doctorRegistration) {
	       Response response = new Response();
		
		DoctorRegistration addDoctorRegistration = doctorRegistrationRepository.save(doctorRegistration);
		response.setDetails("doctor added sucessfully");
		response.setData(addDoctorRegistration);
		return response;
	}


	@Override
	public Response list() {
		 Response response = new Response();
			List<DoctorRegistration> doctorList =  doctorRegistrationRepository.findAll();
			response.setData(doctorList);;
		return response;
	}


	@Override
	public Response findByCategory(Integer doctorCategory) {
		 Response response = new Response();
		 List<DoctorRegistration> doctorCategoryList =  doctorRegistrationRepository.findByDoctorCategory(doctorCategory);
		 response.setData(doctorCategoryList);
		return response;
	}


	@Override
	public Response doctorAvailability(Integer doctorCategory, boolean dayAvailableStatus) {
		Response response = new Response();
		response.setCount(doctorCategory);
		response.setStatus(dayAvailableStatus);
		 List<DoctorRegistration> doctorAvailability = doctorRegistrationRepository.findAllByDoctorCategoryAndDayAvailableStatus(doctorCategory,dayAvailableStatus);                   
		response.setData(doctorAvailability);
		return response;
	}


 
	
	

}
