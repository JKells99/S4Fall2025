package com.keyin.pharmacy;

import com.keyin.medication.Medication;
import com.keyin.patient.Patient;
import com.keyin.prescription.Prescription;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {

    private List<Patient> patients;
    private List<Medication> medications;
    private List<Prescription> prescriptions;

    public Pharmacy() {
        this.patients = new ArrayList<>();
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();

    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }
    public void addMedication(Medication medication) {
        this.medications.add(medication);
    }
    public void addPrescription(Prescription prescription) {
        this.prescriptions.add(prescription);
    }
}
