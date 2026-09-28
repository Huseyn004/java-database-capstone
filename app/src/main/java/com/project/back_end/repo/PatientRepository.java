package com.project.back_end.repo;

import com.project.back_end.models.Patient;
import java.util.List;

public interface PatientRepository {

    Patient findById(int patientId);

    List<Patient> findAll();

    boolean save(Patient patient);

    boolean update(Patient patient);

    boolean deleteById(int patientId);
}
