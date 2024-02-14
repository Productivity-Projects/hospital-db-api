package com.hospital.db.reposoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.db.model.DoctorCategory;
import com.hospital.db.model.DoctorRegistration;

@Repository
public interface DoctorCategoryRepository extends JpaRepository<DoctorRegistration, Integer>{

	DoctorCategory save(DoctorCategory doctorCategory);

	DoctorCategory save(Integer doctorCategoryId);

	 

}
