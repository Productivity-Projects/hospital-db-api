package com.hospital.db.reposoitory;

import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.db.model.DoctorAppointment;

@Repository
public interface DoctorAppointmentRepository extends JpaRepository<DoctorAppointment, Integer>{



}
