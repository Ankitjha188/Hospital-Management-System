package com.Lilac.HospitalManagementSystem.repository;

import com.Lilac.HospitalManagementSystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findByNameContaining(String name);

    List<Doctor> findBySpecializationContaining(String specialization);

    Doctor findByEmail(String email);

    Doctor findByPhone(String phone);
}