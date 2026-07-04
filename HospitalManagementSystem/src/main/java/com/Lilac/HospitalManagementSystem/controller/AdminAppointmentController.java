package com.Lilac.HospitalManagementSystem.controller;

import com.Lilac.HospitalManagementSystem.entity.Appointment;
import com.Lilac.HospitalManagementSystem.service.AppointmentService;
import com.Lilac.HospitalManagementSystem.service.DoctorService;
import com.Lilac.HospitalManagementSystem.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/appointments")
@RequiredArgsConstructor
public class AdminAppointmentController {

    private final AppointmentService appointmentService;
    private final PatientService patientService;
    private final DoctorService doctorService;

    @GetMapping
    public String listAllAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.getAllAppointments());
        return "admin-appointment-list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Appointment appointment = appointmentService.getAppointmentById(id);

        model.addAttribute("appointment", appointment);
        model.addAttribute("patients", patientService.getAllPatients());
        model.addAttribute("doctors", doctorService.getAllDoctors());

        return "admin-appointment-edit";
    }

    @PostMapping("/update/{id}")
    public String updateAppointment(
            @PathVariable Long id,
            @ModelAttribute Appointment appointment) {

        appointment.setId(id);
        appointmentService.saveAppointment(appointment);

        return "redirect:/admin/appointments";
    }

    @GetMapping("/cancel/{id}")
    public String cancelAppointment(@PathVariable Long id) {
        Appointment appointment = appointmentService.getAppointmentById(id);
        appointment.setStatus("CANCELLED");
        appointmentService.saveAppointment(appointment);

        return "redirect:/admin/appointments";
    }
}