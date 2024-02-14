package com.hospital.db.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.db.model.PatientMedication;

@RequestMapping("/medication")
public class PatientMedicationController {

	@PostMapping("/save")
	public PatientMedication savePatientMedication(@RequestBody PatientMedication patientMedication) {

		return patientMedication;

	}

}
