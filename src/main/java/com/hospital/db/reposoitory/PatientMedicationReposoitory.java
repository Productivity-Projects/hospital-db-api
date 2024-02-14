package com.hospital.db.reposoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.db.model.PatientMedication;

@Repository
public interface PatientMedicationReposoitory extends JpaRepository<PatientMedication, Integer> {

}
