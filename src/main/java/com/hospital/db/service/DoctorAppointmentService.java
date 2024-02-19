package com.hospital.db.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import com.hospital.db.model.DoctorAppointment;
import com.springbootcommonlib.response.Response;

public interface DoctorAppointmentService {



	Response bookDoctorAppointment(DoctorAppointment doctorAppointment, Date scheduledTimeFrom,
			Date scheduledTimeTo, Integer patientId, Integer doctorId, Integer doctorCategoryId);

}
