package com.hospital.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.db.model.DoctorAppointment;
import com.hospital.db.reposoitory.DoctorAppointmentRepository;
import com.hospital.db.service.DoctorAppointmentService;
import com.springbootcommonlib.response.Response;
import com.springbootcommonlib.service.impl.MailServiceImpl;

@Service
public class DoctorAppointmentServiceImpl implements DoctorAppointmentService {

	@Autowired
	DoctorAppointmentRepository doctorAppointmentRepository;
	
	@Autowired
	MailServiceImpl mailServiceImpl;

	@Override
	public Response bookDoctorAppointment(DoctorAppointment doctorAppointment, String scheduledTimeFrom,
			String scheduledTimeTo, Integer patientId, Integer doctorId, Integer doctorCategoryId) {

		Response response = new Response();
		
		System.out.println(scheduledTimeTo );
		
	    mailServiceImpl.sendMail( null, null);
	 
		return null;
		
	}

}
