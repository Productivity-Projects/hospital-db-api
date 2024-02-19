package com.hospital.db.service;

import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.db.model.DoctorCategory;
import com.hospital.db.model.DoctorRegistration;
import com.springbootcommonlib.response.Response;

public interface DoctorRegistrationService {

	Response add(DoctorRegistration doctorRegistration);

	Response list();

	Response findByCategory(Integer doctorCategory);

	Response doctorAvailability(Integer doctorCategory, boolean dayAvailableStatus);


	 

}
