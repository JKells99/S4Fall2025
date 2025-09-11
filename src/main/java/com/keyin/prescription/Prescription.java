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
    public Prescription(long prescriptionId, Patient patient, Medication medication, String dosageInstructions, String prescribingDoctor, int numberOfMedsNeeded) {
        this.prescriptionId = prescriptionId;
        this.patient = patient;
        this.dosageInstructions = dosageInstructions;
        this.prescribingDoctor = prescribingDoctor;
        this.medication = medication;
        this.numberOfMedsNeeded = numberOfMedsNeeded;
        medication.reduceStock(numberOfMedsNeeded);
        patient.addMedication(medication);
    }
    public Prescription(Patient patient,Medication medication, String dosageInstructions, String prescribingDoctor, int numberOfMedsNeeded) {
        this.patient = patient;
        this.dosageInstructions = dosageInstructions;
        this.prescribingDoctor = prescribingDoctor;
        this.medication = medication;
        this.numberOfMedsNeeded = numberOfMedsNeeded;
        medication.reduceStock(numberOfMedsNeeded);
        patient.addMedication(medication);

    }
    public Prescription() {

    }

    public int getNumberOfMedsNeeded() {
        return numberOfMedsNeeded;
    }

    public void setNumberOfMedsNeeded(int numberOfMedsNeeded) {
        this.numberOfMedsNeeded = numberOfMedsNeeded;
    }

    public String getDosageInstructions() {
        return dosageInstructions;
    }

    public void setDosageInstructions(String dosageInstructions) {
        this.dosageInstructions = dosageInstructions;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPrescribingDoctor() {
        return prescribingDoctor;
    }

    public void setPrescribingDoctor(String prescribingDoctor) {
        this.prescribingDoctor = prescribingDoctor;
    }

    public long getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }


    @Override
    public String toString() {
        return STR."Prescription{prescriptionId=\{prescriptionId}, patient=\{patient.getPatientName()}, medication=\{medication.getMedName()}, dosageInstructions='\{dosageInstructions}\{'\''}, prescribingDoctor='\{prescribingDoctor}\{'\''}\{'}'}";
    }
}
