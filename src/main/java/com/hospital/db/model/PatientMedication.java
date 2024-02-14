package com.hospital.db.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient_medication", schema = "health", catalog = "health")
public class PatientMedication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer patientMedicationId;
	public String name;
	public Date visitedOn;
	public Integer createdBy;
	public String healthCondition;
	public Integer patientId;


	

	public Integer getPatientMedicationId() {
		return patientMedicationId;
	}

	public void setPatientMedicationId(Integer patientMedicationId) {
		this.patientMedicationId = patientMedicationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getVisitedOn() {
		return visitedOn;
	}

	public void setVisitedOn(Date visitedOn) {
		this.visitedOn = visitedOn;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getHealthCondition() {
		return healthCondition;
	}

	public void setHealthCondition(String healthCondition) {
		this.healthCondition = healthCondition;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

}
