package com.hospital.db.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="doctorRegistration")
public class DoctorRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String doctorId;
	String name;
	Integer doctorCategory;
	String phoneNo;
	String gender;
	String address;
	Integer salary;
	Integer experience;
	Boolean availability;
	
	@UpdateTimestamp
	LocalDateTime dateUpdateed;
	
	
}
