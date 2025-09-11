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

    public Patient(List<Medication> medications, int patientAge, long patientId, String patientMedicalHistorySummary, String patientName) {
        this.medications = medications;
        this.patientAge = patientAge;
        this.patientId = patientId;
        this.patientMedicalHistorySummary = patientMedicalHistorySummary;
        this.patientName = patientName;
    }

    public Patient(long patientId, String patientMedicalHistorySummary, String patientName) {
        this.patientId = patientId;
        this.patientMedicalHistorySummary = patientMedicalHistorySummary;
        this.patientName = patientName;
        this.medications = new ArrayList<>();
    }

    public Patient() {

    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getPatientMedicalHistorySummary() {
        return patientMedicalHistorySummary;
    }

    public void setPatientMedicalHistorySummary(String patientMedicalHistorySummary) {
        this.patientMedicalHistorySummary = patientMedicalHistorySummary;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public void clearMedications() {
        this.medications.clear();
    }
    public void removeMedication(Medication medication) {
        this.medications.remove(medication);
    }
    public boolean doseCheckerForNewScriptToSignalDoseChange(Medication medication) {
        if(!this.medications.contains(medication)){
            if(medication.getMedDosage() != null){
                for(Medication med : this.medications){
                    if(med.getMedName().equals(medication.getMedName()) && !med.getMedDosage().equals(medication.getMedDosage())){
                        return true;
                    }
                }
            }
            return false;
        }


        return false;
    }
    public void addMedication(Medication medication) {
        if (!this.medications.contains(medication)) {
            if(doseCheckerForNewScriptToSignalDoseChange(medication)){
                System.out.println(STR."Warning: \{medication.getMedName()} dosage has changed. Please review patient's medication history.");
            }
            this.medications.add(medication);
        } else {
            System.out.println("Medication already exists for this patient. Please Update Refils instead.");
        }
    }

    @Override
    public String toString() {
        return STR."Patient{patientAge=\{patientAge}, patientId=\{patientId}, patientName='\{patientName}\{'\''}, patientMedicalHistorySummary='\{patientMedicalHistorySummary}\{'\''}\{'}'}";
    }
}
