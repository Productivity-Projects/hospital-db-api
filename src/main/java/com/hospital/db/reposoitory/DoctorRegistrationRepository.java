package com.hospital.db.reposoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.db.model.DoctorRegistration;

@Repository
public interface DoctorRegistrationRepository extends JpaRepository<DoctorRegistration, Integer> {

	

}
