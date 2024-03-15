package com.hospital.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.db.model.PatientRegistration;
import com.hospital.db.reposoitory.RegistrationRepo;
import com.hospital.db.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {
 
	@Autowired
	private RegistrationRepo regRepo;
	
	@Override
	public PatientRegistration SavePatient(PatientRegistration patientDetials) {
		PatientRegistration savedPatient = regRepo.save(patientDetials);
		return savedPatient;
	}

}
