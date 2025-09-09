# Pharmacy & Prescription Management App

## Project Overview
A multi-stage application for managing pharmacy inventory, prescriptions, and patient records. The project evolves from a Java/Maven backend to a full-stack solution with Spring Boot and React, supporting advanced features like authentication, reporting, and cloud deployment.

---

## 🌱 Stage 1: Core Java + Maven

### Entities
- **Medication**: `id`, `name`, `dosage`, `stock quantity`
- **Patient**: `id`, `name`, `age`, `medical history summary`
- **Prescription**: `id`, `patient`, `list of medications`, `dosage instructions`, `prescribing doctor`

### Features
- Add medications to inventory
- Create a prescription for a patient
- List patient prescriptions
- Deduct stock when prescriptions are created

### Skills
- OOP
- Collections
- JUnit

---

## 🚀 Stage 2: Spring Boot API + MYSQL DB

### Endpoints
- `/medications`: CRUD + stock tracking
- `/patients`: CRUD
- `/prescriptions`: issue & view/process prescriptions

### Enhancements
- Validation: no negative stock, patient must exist to create prescription
- Testing: unit tests + integration tests (MockMVC/Testcontainers)

---

## 🌐 Stage 3: React Frontend

### Pages
- Medication Inventory: add/update stock, view levels
- Patients: list, add, update
- Prescriptions: create prescription (dropdown for meds & dosage), view history

### Extras For Fun If Time Allows
- Low-stock warning banner
- Search medications by name
- Patient prescription history view

---

## 🔒 Stage 4: Advanced Enhancements

### Roles & Auth
- Pharmacist: manages stock
- Patient: views prescriptions

### Reports
- "Top prescribed medications" chart
- "Patient perscription overview (shows patient info)

### Deployment
- Backend:AWS
- Frontend: AWS
- PR workflow in GitHub with GH actions set up

---
## License
MIT

## Purpose Of This Repo
- This will provide a good example for S4 students at Keyin College SD Program

