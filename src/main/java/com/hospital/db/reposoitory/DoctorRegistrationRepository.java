package com.hospital.db.reposoitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.db.model.DoctorRegistration;

@Repository
public interface DoctorRegistrationRepository extends JpaRepository<DoctorRegistration, Integer> {

	List<DoctorRegistration> findByDoctorCategory(Integer doctorCategory);

	List<DoctorRegistration> findAllByDoctorCategoryAndDayAvailableStatus(Integer doctorCategory,boolean dayAvailableStatus);

	 

	

}
