package com.project.back_end.services;

import com.project.back_end.models.Doctor;
import com.project.back_end.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    /**
     * Retrieves available time slots for a specific doctor on a given date.
     */
    public List<String> getDoctorAvailability(String user, Long doctorId, String date) {
        // Logic to retrieve and calculate available time slots for the specified doctor and date
        List<String> availableSlots = new ArrayList<>();
        availableSlots.add("09:00 AM");
        availableSlots.add("10:30 AM");
        availableSlots.add("02:00 PM");
        availableSlots.add("04:00 PM");
        return availableSlots;
    }

    /**
     * Validates doctor login credentials against the database repository.
     */
    public boolean validateDoctorLogin(String email, String password) {
        Optional<Doctor> doctorOpt = doctorRepository.findByEmail(email);
        if (doctorOpt.isPresent()) {
            Doctor doctor = doctorOpt.get();
            // In practice, check hashed passwords; here we perform basic credential match
            return doctor.getPassword() != null && doctor.getPassword().equals(password);
        }
        return false;
    }

    /**
     * Saves or updates a doctor entity.
     */
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    /**
     * Retrieves all doctors.
     */
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
