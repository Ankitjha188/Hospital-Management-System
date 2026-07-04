//package com.Lilac.HospitalManagementSystem;
//
//import com.Lilac.HospitalManagementSystem.Service.PatientService;
//import com.Lilac.HospitalManagementSystem.entity.Patient;
//import com.Lilac.HospitalManagementSystem.repository.PatientRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//
//import java.util.List;
//
//@SpringBootTest
//public class PatientTests {
//
//    @Autowired
//    private PatientRepository patientRepository;
//
//    @Autowired
//    private PatientService patientService;
//
//    @Test
//    public void testPatientRepositoy() {
//        List<Patient> patientList = patientRepository.findAll();
//        System.out.println(patientList);
//    }
//
//    @Test
//    public void testTransactionMethods() {
////        Patient patient = patientService.getPatientById(1L);
//
////        Patient p2 = patientRepository.findById(1L).orElseThrow(
////                () -> new EntityNotFoundException("Patient not find by id: 1")
////        );
//
////        Patient patient = patientRepository.findByName("Neha Iyer");
//
////        List<Patient> patientList = patientRepository.findByEmailOrBirthDate("neha.iyer@example.com", LocalDate.of(1988, 3, 15));
//
////        List<Patient> patientList = patientRepository.findByNameContaining("Di");
//
////        List<Patient> patientList = patientRepository.findByBloodGroup(BloodGroupType.O_POSITIVE);
//
////        List<Patient> patientList = patientRepository.findByBirthDate(LocalDate.of(1992, 12, 01));
////
////        for(Patient patient: patientList) {
////            System.out.println(patient);
////        }
////
////        List<Object[]> bloodGroupList = patientRepository.countEachBloodGroup();
////
////        for(Object[] object: bloodGroupList) {
////            System.out.println(object[0] + " " + object[1]);
////        }
//
////        List<Patient> patientList = patientRepository.findAllPatient();
////
////        for(Patient patients : patientList) {
////            System.out.println(patients);
////       }
////
////        int updated = patientRepository.updateNameInId("Kabeer Singh", 5L);
////        System.out.println(updated);
//
////        List<BloodGroupCountRepositoryEntity> bloodGroupList = patientRepository.countEachBloodGroupType();
////
////        for(BloodGroupCountRepositoryEntity patients : bloodGroupList) {
////            System.out.println(patients);
////        }
//
//        Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(0, 2));
//
//        for(Patient patients : patientList) {
//            System.out.println(patients);
//        }
//    }
//}