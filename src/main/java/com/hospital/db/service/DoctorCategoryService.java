package com.hospital.db.service;

import com.hospital.db.model.DoctorCategory;
import com.springbootcommonlib.response.Response;

public interface DoctorCategoryService {

	Response add(DoctorCategory doctorCategory);
	
	Response update(DoctorCategory doctorCategory);

	 

}
