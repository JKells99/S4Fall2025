/*
 * Prescription.java
 * Represents a prescription linking patients and medications.
 * Author: Jordan Kelloway
 * Date: September 12, 2025
 */

package com.keyin.prescription;

import com.keyin.medication.Medication;
import com.keyin.patient.Patient;

import java.util.List;

public class Prescription {
//    id, patient, list of medications, dosage instructions, prescribing doctor
    private long prescriptionId;
    private Patient patient;
    private Medication medication;
    private String dosageInstructions;
    private String prescribingDoctor;
    private int numberOfMedsNeeded;
    /**
     * Constructs a Prescription with all fields specified.
     * @param prescriptionId the prescription ID
     * @param patient the patient
     * @param medication the medication
     * @param dosageInstructions dosage instructions
     * @param prescribingDoctor prescribing doctor
     * @param numberOfMedsNeeded number of medications needed
     */
    public Prescription(long prescriptionId, Patient patient, Medication medication, String dosageInstructions, String prescribingDoctor, int numberOfMedsNeeded) {
        this.prescriptionId = prescriptionId;
        this.patient = patient;
        this.dosageInstructions = dosageInstructions;
        this.prescribingDoctor = prescribingDoctor;
        this.medication = medication;
        this.numberOfMedsNeeded = numberOfMedsNeeded;
    }
    /**
     * Constructs a Prescription without an ID.
     * @param patient the patient
     * @param medication the medication
     * @param dosageInstructions dosage instructions
     * @param prescribingDoctor prescribing doctor
     * @param numberOfMedsNeeded number of medications needed
     */
    public Prescription(Patient patient,Medication medication, String dosageInstructions, String prescribingDoctor, int numberOfMedsNeeded) {
        this.patient = patient;
        this.dosageInstructions = dosageInstructions;
        this.prescribingDoctor = prescribingDoctor;
        this.medication = medication;
        this.numberOfMedsNeeded = numberOfMedsNeeded;
    }
    /**
     * Processes the prescription by reducing medication stock and adding the medication to the patient.
     */
    public void processPrescription() {
        if (medication != null && patient != null && numberOfMedsNeeded > 0) {
            medication.reduceStock(numberOfMedsNeeded);
            patient.addMedication(medication);
        }
    }
    /**
     * Default constructor for Prescription.
     */
    public Prescription() {

    }
    /**
     * Gets the number of medications needed.
     * @return number of medications needed
     */
    public int getNumberOfMedsNeeded() {
        return numberOfMedsNeeded;
    }
    /**
     * Sets the number of medications needed.
     * @param numberOfMedsNeeded number of medications needed
     */
    public void setNumberOfMedsNeeded(int numberOfMedsNeeded) {
        this.numberOfMedsNeeded = numberOfMedsNeeded;
    }
    /**
     * Gets the dosage instructions.
     * @return dosage instructions
     */
    public String getDosageInstructions() {
        return dosageInstructions;
    }
    /**
     * Sets the dosage instructions.
     * @param dosageInstructions dosage instructions
     */
    public void setDosageInstructions(String dosageInstructions) {
        this.dosageInstructions = dosageInstructions;
    }
    /**
     * Gets the medication.
     * @return medication
     */
    public Medication getMedication() {
        return medication;
    }
    /**
     * Sets the medication.
     * @param medication medication
     */
    public void setMedication(Medication medication) {
        this.medication = medication;
    }
    /**
     * Gets the patient.
     * @return patient
     */
    public Patient getPatient() {
        return patient;
    }
    /**
     * Sets the patient.
     * @param patient patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    /**
     * Gets the prescribing doctor.
     * @return prescribing doctor
     */
    public String getPrescribingDoctor() {
        return prescribingDoctor;
    }
    /**
     * Sets the prescribing doctor.
     * @param prescribingDoctor prescribing doctor
     */
    public void setPrescribingDoctor(String prescribingDoctor) {
        this.prescribingDoctor = prescribingDoctor;
    }
    /**
     * Gets the prescription ID.
     * @return prescription ID
     */
    public long getPrescriptionId() {
        return prescriptionId;
    }
    /**
     * Sets the prescription ID.
     * @param prescriptionId prescription ID
     */
    public void setPrescriptionId(long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }
    /**
     * Returns a string representation of the Prescription object.
     * @return string representation
     */
    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId=" + prescriptionId +
                ", patient=" + patient +
                ", medication=" + medication +
                ", dosageInstructions='" + dosageInstructions + '\'' +
                ", prescribingDoctor='" + prescribingDoctor + '\'' +
                ", numberOfMedsNeeded=" + numberOfMedsNeeded +
                '}';
    }
}
