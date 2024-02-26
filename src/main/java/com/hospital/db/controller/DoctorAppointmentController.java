package com.hospital.db.controller;

 
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.db.model.DoctorAppointment;
import com.hospital.db.service.DoctorAppointmentService;
import com.springbootcommonlib.response.Response;

@RestController
@RequestMapping("/doctorAppointment")
public class DoctorAppointmentController {
	
	@Autowired
	DoctorAppointmentService doctorAppointmentService;
	
	@PostMapping("booking")
	public Response bookDoctorAppointment(@RequestBody DoctorAppointment doctorAppointment, @RequestParam String scheduledTimeFrom, String scheduledTimeTo,Integer patientId,Integer doctorId,Integer doctorCategoryId) {
		return doctorAppointmentService.bookDoctorAppointment(doctorAppointment,scheduledTimeFrom,scheduledTimeTo,patientId,doctorId,doctorCategoryId);
	}
	
	

}
