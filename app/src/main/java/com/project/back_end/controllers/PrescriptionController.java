package com.project.back_end.controllers;

import com.project.back_end.models.Prescription;
import com.project.back_end.services.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    /**
     * Endpoint to save a new prescription using POST.
     * Accepts a Prescription object in the request body and returns a structured ResponseEntity.
     */
    @PostMapping
    public ResponseEntity<?> addPrescription(@RequestBody Prescription prescription) {
        if (prescription == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Prescription payload cannot be empty.");
        }

        Prescription savedPrescription = prescriptionService.savePrescription(prescription);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPrescription);
    }
}
