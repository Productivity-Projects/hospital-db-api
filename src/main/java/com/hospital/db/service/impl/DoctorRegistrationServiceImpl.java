package com.hospital.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
