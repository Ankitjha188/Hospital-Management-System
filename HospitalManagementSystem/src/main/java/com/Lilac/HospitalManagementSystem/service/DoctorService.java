package com.Lilac.HospitalManagementSystem.service;

import com.Lilac.HospitalManagementSystem.entity.Doctor;
import com.Lilac.HospitalManagementSystem.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElseThrow();
    }

    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public void deleteDoctorById(Long id) {
        doctorRepository.deleteById(id);
    }

    public List<Doctor> searchByName(String name) {
        return doctorRepository.findByNameContaining(name);
    }

    public List<Doctor> searchBySpecialization(String specialization) {
        return doctorRepository.findBySpecializationContaining(specialization);
    }

    List<Doctor> getDoctorsBySpecialization(String specialization) {
        return null;
    }

}