package com.hospital.db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name= "doctorCategory")
public class DoctorCategory {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer doctorCategoryId;
	String category;
	Boolean status;
	

}
