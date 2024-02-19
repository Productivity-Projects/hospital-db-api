package com.hospital.db.service.impl;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.db.model.DoctorAppointment;
import com.hospital.db.reposoitory.DoctorAppointmentRepository;
import com.hospital.db.service.DoctorAppointmentService;
import com.springbootcommonlib.response.Response;
import com.springbootcommonlib.utils.DateUtils;

@Service
public class DoctorAppointmentServiceImpl implements DoctorAppointmentService {

	@Autowired
	DoctorAppointmentRepository doctorAppointmentRepository;

	@Override
	public Response bookDoctorAppointment(DoctorAppointment doctorAppointment, Date scheduledTimeFrom,
			Date scheduledTimeTo, Integer patientId, Integer doctorId, Integer doctorCategoryId) {

		Response response = new Response();
		Date todaysTime = new Date();
		System.out.println(todaysTime);
		try {
			System.out.println(	DateUtils.getTodayDate());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
// LocalTime morning9 = LocalTime.of(9, 00, 00, 00);
//		LocalTime morning11 = LocalTime.of(11, 01, 00, 00);
//		LocalTime afternon4 = LocalTime.of(15, 59, 00, 00);// 4pm
//		LocalTime afternon6 = LocalTime.of(19, 01, 00, 00); // 7pm

		return response;
	}

}
