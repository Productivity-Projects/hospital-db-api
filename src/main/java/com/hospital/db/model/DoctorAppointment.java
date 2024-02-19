package com.hospital.db.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name="DoctorAppointment")
public class DoctorAppointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer apointmentId;
	Integer patientId;
	Integer doctorCategoryId;
	Integer doctorId;

	@CreationTimestamp
	Date scheduledTimeFrom;
	@CreationTimestamp
	Date scheduledTimeTo;
	@UpdateTimestamp
	Date UpdatedTime;
	
}
