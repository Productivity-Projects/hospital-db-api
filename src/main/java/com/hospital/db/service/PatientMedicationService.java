package com.hospital.db.service;

import java.util.List;

import com.hospital.db.model.PatientMedication;


public interface PatientMedicationService {
	
	//PatientMedication PatientMedicationReposoitory(PatientMedication patientHistory);
    PatientMedication savePatientMedication(PatientMedication patientMedication);
    List<PatientMedication> getAllPatientMedications();
    PatientMedication getPatientMedicationById(Integer id);

	

}
