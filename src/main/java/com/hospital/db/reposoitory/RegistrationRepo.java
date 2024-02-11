package com.hospital.db.reposoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.db.model.PatientRegistration;

@Repository
public interface RegistrationRepo extends JpaRepository<PatientRegistration, Integer> {

}
