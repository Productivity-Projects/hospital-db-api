package com.hospital.db.service;

import com.hospital.db.model.DoctorCategory;
import com.hospital.db.model.DoctorRegistration;
import com.springbootcommonlib.response.Response;

public interface DoctorRegistrationService {

	Response add(DoctorRegistration doctorRegistration);

	 

}
