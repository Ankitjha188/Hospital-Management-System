package com.Lilac.HospitalManagementSystem.repository;

import com.Lilac.HospitalManagementSystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByEmail(String email);

    Patient findByPhone(String phone);

    List<Patient> findByNameContainingIgnoreCase(String name);
}
