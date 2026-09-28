# Database Schema Design

## Database Overview
This MySQL schema manages doctors, patients, and appointments for a healthcare system.

## Tables & Relationships

### 1. `doctors`
Stores information about medical personnel.
- **`doctor_id`** (INT, Primary Key, Auto Increment)
- **`first_name`** (VARCHAR(50), NOT NULL)
- **`last_name`** (VARCHAR(50), NOT NULL)
- **`specialty`** (VARCHAR(100))
- **`phone`** (VARCHAR(20))

### 2. `patients`
Stores information about registered patients.
- **`patient_id`** (INT, Primary Key, Auto Increment)
- **`first_name`** (VARCHAR(50), NOT NULL)
- **`last_name`** (VARCHAR(50), NOT NULL)
- **`phone`** (VARCHAR(20), NOT NULL)
- **`email`** (VARCHAR(100))

### 3. `appointments`
Tracks scheduled medical visits linking doctors and patients.
- **`appointment_id`** (INT, Primary Key, Auto Increment)
- **`doctor_id`** (INT, Foreign Key referencing `doctors(doctor_id)`)
- **`patient_id`** (INT, Foreign Key referencing `patients(patient_id)`)
- **`appointment_time`** (DATETIME, NOT NULL)
- **`status`** (ENUM('PENDING', 'CONFIRMED', 'CANCELLED', 'COMPLETED'), Default: 'PENDING')

## Entity-Relationship Diagram (ERD) Structure
- **doctors** (1) $\rightarrow$ ($\infty$) **appointments** (One doctor can have many appointments)
- **patients** (1) $\rightarrow$ ($\infty$) **appointments** (One patient can have many appointments)
