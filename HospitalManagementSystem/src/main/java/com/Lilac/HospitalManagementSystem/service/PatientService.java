package com.Lilac.HospitalManagementSystem.service;

import com.Lilac.HospitalManagementSystem.entity.Patient;
import com.Lilac.HospitalManagementSystem.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Patient not found with id: " + id));
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }

    // these methods are for search
    public List<Patient> searchPatients(String keyword) {

        if (keyword == null || keyword.trim().isEmpty()) {
            return patientRepository.findAll();
        }

        keyword = keyword.trim();

        if (keyword.contains("@")) {
            Patient patient = patientRepository.findByEmail(keyword);
            return patient != null ? List.of(patient) : List.of();
        }

        if (keyword.matches("\\d+")) {
            Patient patient = patientRepository.findByPhone(keyword);
            return patient != null ? List.of(patient) : List.of();
        }

        return patientRepository.findByNameContainingIgnoreCase(keyword);
    }
}