# Capstone Project User Stories

## 1. Doctor User Stories

### Story 1.1: View Daily Schedule
* **Title:** Doctor Schedule Overview
* **User Story:** As a Doctor, I want to view my daily appointment schedule so that I can manage my patient visits efficiently.
* **Acceptance Criteria:**
  - System displays appointments filtered by selected date and logged-in doctor ID.
  - Lists patient name, appointment time, and status.
* **Priority:** High
* **Story Points:** 3

### Story 1.2: Update Appointment Status
* **Title:** Update Patient Appointment Status
* **User Story:** As a Doctor, I want to update appointment statuses (e.g., Completed, Cancelled) so that patient records are accurate.
* **Acceptance Criteria:**
  - Doctor can change appointment status from pending to completed or cancelled.
  - System updates the status timestamp in the database.
* **Priority:** High
* **Story Points:** 2

---

## 2. Patient User Stories

### Story 2.1: View Scheduled Appointments
* **Title:** Patient Upcoming Appointments
* **User Story:** As a Patient, I want to view my upcoming appointments so that I do not miss scheduled visits.
* **Acceptance Criteria:**
  - Patient sees a chronological list of their active appointments.
  - Displays doctor name, department, time, and room number.
* **Priority:** High
* **Story Points:** 2

### Story 2.2: Provide Contact Details
* **Title:** Manage Patient Profile
* **User Story:** As a Patient, I want to provide and update my contact details so that the clinic can reach me with updates.
* **Acceptance Criteria:**
  - Patient can update email, phone number, and home address.
  - Input validation enforces correct phone and email formats.
* **Priority:** Medium
* **Story Points:** 1

---

## 3. Admin User Stories

### Story 3.1: Manage Medical Records
* **Title:** Patient Record Administration
* **User Story:** As an Admin, I want to manage doctor and patient records so that clinic operations remain up-to-date.
* **Acceptance Criteria:**
  - Admin can add, edit, or deactivate doctor and patient accounts.
  - Action log records admin changes for auditing purposes.
* **Priority:** High
* **Story Points:** 5

### Story 3.2: Generate Clinic Reports
* **Title:** Generate Daily/Monthly Clinic Reports
* **User Story:** As an Admin, I want to generate daily and monthly attendance/appointment reports to monitor clinic performance.
* **Acceptance Criteria:**
  - Admin specifies a date range to aggregate appointment statistics.
  - Report output includes total visits, completed visits, and date summary.
* **Priority:** Medium
* **Story Points:** 3
