package com.hospital.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.db.model.PatientMedication;
import com.hospital.db.reposoitory.PatientMedicationReposoitory;
import com.hospital.db.service.PatientMedicationService;
@Service
public abstract class PatientMedicationServiceImpl implements PatientMedicationService {
    @Autowired
    public PatientMedicationReposoitory patientMedicationReposoitory;
	@Override
	public PatientMedication savePatientMedication(PatientMedication patientMedication) {
		
		return null;
	}

}
