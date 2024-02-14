package com.hospital.db.service;

import com.hospital.db.model.PatientRegistration;

public interface RegistrationService {

	PatientRegistration SavePatient(PatientRegistration patientDetials);
	
}
