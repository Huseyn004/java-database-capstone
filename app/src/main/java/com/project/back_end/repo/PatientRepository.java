package com.project.back_end.repo;

import com.project.back_end.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    /**
     * Retrieves a patient by their email address.
     */
    Optional<Patient> findByEmail(String email);

    /**
     * Retrieves a patient matching either their email address or phone number.
     */
    Optional<Patient> findByEmailOrPhone(String email, String phone);
}
