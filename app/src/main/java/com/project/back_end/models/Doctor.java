package com.project.back_end.models;

public class Doctor {
    private int doctorId;
    private String firstName;
    private String lastName;
    private String specialty;
    private String phone;

    public Doctor() {}

    public Doctor(int doctorId, String firstName, String lastName, String specialty, String phone) {
        this.doctorId = doctorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.phone = phone;
    }

    // Getters and Setters
    public int getDoctorId() { return doctorId; }
    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
