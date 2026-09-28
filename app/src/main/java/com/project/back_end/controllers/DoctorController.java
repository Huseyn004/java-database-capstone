package com.project.back_end.controllers;

import com.project.back_end.models.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorController {

    public List<Doctor> getAllDoctors() {
        // Logic to fetch all doctors from the database
        return new ArrayList<>();
    }

    public Doctor getDoctorById(int doctorId) {
        // Logic to fetch a doctor by ID from the database
        return null;
    }

    public boolean addDoctor(Doctor doctor) {
        // Logic to add a new doctor
        return true;
    }
}
