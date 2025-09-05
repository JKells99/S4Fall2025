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
- OOP: composition, inheritance for medication types
- Collections: `Map` for inventory, `List` for prescriptions
- JUnit + Maven for testing

---

## 🚀 Stage 2: Spring Boot API

### Endpoints
- `/medications`: CRUD + stock tracking
- `/patients`: CRUD
- `/prescriptions`: issue & view prescriptions

### Enhancements
- H2 → PostgreSQL migration
- Validation: no negative stock, patient must exist to create prescription
- Testing: unit tests + integration tests (MockMVC/Testcontainers)

---

## 🌐 Stage 3: React Frontend

### Pages
- Medication Inventory: add/update stock, view levels
- Patients: list, add, update
- Prescriptions: create prescription (dropdown for meds & dosage), view history

### Extras
- Low-stock warning banner
- Search medications by name
- Patient prescription history view

---

## 🔒 Stage 4: Advanced Enhancements

### Roles & Auth
- Pharmacist: manages stock
- Doctor: prescribes meds
- Patient: views prescriptions

### Reports
- "Top prescribed medications" chart
- "Patients with most prescriptions" dashboard

### Deployment
- Backend: Heroku/Render/AWS
- Frontend: Vercel/Netlify
- CI/CD + PR workflow

---

## Getting Started
1. Clone the repository
2. Build with Maven: `mvn clean install`
3. Run tests: `mvn test`
4. For Spring Boot: `mvn spring-boot:run`
5. For frontend (Stage 3+): see `/frontend` folder

## License
MIT

## Author
Jordan

