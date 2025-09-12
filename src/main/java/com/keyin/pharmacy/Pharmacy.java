/*
 * Pharmacy.java
 * Manages patients, medications, and prescriptions in the pharmacy system.
 * Author: Jordan Kelloway
 * Date: September 12, 2025
 */

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

    /**
     * Constructs a Pharmacy with empty lists for patients, medications, and prescriptions.
     */
    public Pharmacy() {
        this.patients = new ArrayList<>();
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();

    }

    /**
     * Gets the list of medications in the pharmacy.
     * @return list of medications
     */
    public List<Medication> getMedications() {
        return medications;
    }

    /**
     * Sets the list of medications in the pharmacy.
     * @param medications list of medications
     */
    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    /**
     * Gets the list of patients in the pharmacy.
     * @return list of patients
     */
    public List<Patient> getPatients() {
        return patients;
    }

    /**
     * Sets the list of patients in the pharmacy.
     * @param patients list of patients
     */
    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    /**
     * Gets the list of prescriptions in the pharmacy.
     * @return list of prescriptions
     */
    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    /**
     * Sets the list of prescriptions in the pharmacy.
     * @param prescriptions list of prescriptions
     */
    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    /**
     * Adds a patient to the pharmacy.
     * @param patient patient to add
     */
    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }
    /**
     * Adds a medication to the pharmacy.
     * @param medication medication to add
     */
    public void addMedication(Medication medication) {
        this.medications.add(medication);
    }
    /**
     * Adds a prescription to the pharmacy.
     * @param prescription prescription to add
     */
    public void addPrescription(Prescription prescription) {
        this.prescriptions.add(prescription);
    }
}
