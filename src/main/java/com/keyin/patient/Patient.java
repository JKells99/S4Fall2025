/*
 * Patient.java
 * Represents a patient in the pharmacy system.
 * Author: Jordan Kelloway
 * Date: September 12, 2025
 */

package com.keyin.patient;

import com.keyin.medication.Medication;

import java.util.ArrayList;
import java.util.List;

public class Patient {
//    id, name, age, medical history summary
    private long patientId;
    private String patientName;
    private int patientAge;
    private List<Medication> medications;
    private String patientMedicalHistorySummary;

    /**
     * Constructs a Patient with all fields specified.
     * @param medications list of medications
     * @param patientAge age of the patient
     * @param patientId patient ID
     * @param patientMedicalHistorySummary medical history summary
     * @param patientName name of the patient
     */
    public Patient(List<Medication> medications, int patientAge, long patientId, String patientMedicalHistorySummary, String patientName) {
        this.medications = medications;
        this.patientAge = patientAge;
        this.patientId = patientId;
        this.patientMedicalHistorySummary = patientMedicalHistorySummary;
        this.patientName = patientName;
    }

    /**
     * Constructs a Patient with ID, medical history summary, and name.
     * @param patientId patient ID
     * @param patientMedicalHistorySummary medical history summary
     * @param patientName name of the patient
     */
    public Patient(long patientId, String patientMedicalHistorySummary, String patientName) {
        this.patientId = patientId;
        this.patientMedicalHistorySummary = patientMedicalHistorySummary;
        this.patientName = patientName;
        this.medications = new ArrayList<>();
    }

    /**
     * Default constructor for Patient.
     */
    public Patient() {

    }

    /**
     * Gets the age of the patient.
     * @return patient age
     */
    public int getPatientAge() {
        return patientAge;
    }

    /**
     * Sets the age of the patient.
     * @param patientAge patient age
     */
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    /**
     * Gets the patient ID.
     * @return patient ID
     */
    public long getPatientId() {
        return patientId;
    }

    /**
     * Sets the patient ID.
     * @param patientId patient ID
     */
    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    /**
     * Gets the medical history summary of the patient.
     * @return medical history summary
     */
    public String getPatientMedicalHistorySummary() {
        return patientMedicalHistorySummary;
    }

    /**
     * Sets the medical history summary of the patient.
     * @param patientMedicalHistorySummary medical history summary
     */
    public void setPatientMedicalHistorySummary(String patientMedicalHistorySummary) {
        this.patientMedicalHistorySummary = patientMedicalHistorySummary;
    }

    /**
     * Gets the name of the patient.
     * @return patient name
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * Sets the name of the patient.
     * @param patientName patient name
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * Gets the list of medications for the patient.
     * @return list of medications
     */
    public List<Medication> getMedications() {
        return medications;
    }

    /**
     * Sets the list of medications for the patient.
     * @param medications list of medications
     */
    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    /**
     * Removes all medications from the patient's list.
     */
    public void clearMedications() {
        this.medications.clear();
    }

    /**
     * Removes a specific medication from the patient's list.
     * @param medication medication to remove
     */
    public void removeMedication(Medication medication) {
        this.medications.remove(medication);
    }

    /**
     * Checks if a new medication script signals a dosage change for an existing medication.
     * @param medication medication to check
     * @return true if dosage change is detected, false otherwise
     */
    public boolean doseCheckerForNewScriptToSignalDoseChange(Medication medication) {
        if(!this.medications.contains(medication)){
            if(medication.getMedDosage() != null){
                for(Medication med : this.medications){
                    if(med.getMedName().equals(medication.getMedName()) && !med.getMedDosage().equals(medication.getMedDosage())){
                        removeMedication(med);
                        return true;
                    }
                }
            }
            return false;
        }


        return false;
    }

    /**
     * Adds a medication to the patient's list if not already present.
     * Warns if dosage is different from existing medication.
     * @param medication medication to add
     */
    public void addMedication(Medication medication) {
        if (!this.medications.contains(medication)) {
            if(doseCheckerForNewScriptToSignalDoseChange(medication)){
                System.out.println("Warning This IS A DOSAGE CHANGE for patient: " + patientName + " New Dosage: " + medication.getMedDosage() + " Previous Dosage: " + medication.getMedDosage() + " for medication: " + medication.getMedName() );
            }
            this.medications.add(medication);
        } else {
            System.out.println("Medication already exists for this patient. Please Update Refils instead.");
        }
    }

    public void printMedications() {
        if (medications.isEmpty()) {
            System.out.println("No medications for this patient.");
        } else {
            System.out.println("Medications for patient " + patientName + ":");
            for (Medication med : medications) {
                System.out.println("- " + med.getMedName() + " (" + med.getMedDosage() + ")");
            }
        }
    }

    /**
     * Returns a string representation of the Patient object.
     * @return string representation
     */
    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                ", medications=" + medications +
                ", patientMedicalHistorySummary='" + patientMedicalHistorySummary + '\'' +
                '}';
    }
}
