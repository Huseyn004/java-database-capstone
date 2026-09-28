package com.project.back_end.services;

import com.project.back_end.models.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorService {

    public List<Doctor> getAllDoctors() {
        // Business logic to retrieve all doctors
        return new ArrayList<>();
    }

    public Doctor getDoctorById(int doctorId) {
        // Business logic to retrieve a doctor by ID
        return null;
    }

    public boolean saveDoctor(Doctor doctor) {
        // Business logic to validate and save a doctor
        return true;
    }
}
