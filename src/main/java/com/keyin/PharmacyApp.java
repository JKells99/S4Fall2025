/*
 * PharmacyApp.java
 * Main application class for the Pharmacy Management System.
 * Author: Jordan Kelloway
 * Date: September 12, 2025
 */

package com.keyin;

import com.keyin.medication.MedType;
import com.keyin.medication.Medication;
import com.keyin.patient.Patient;
import com.keyin.pharmacy.Pharmacy;
import com.keyin.prescription.Prescription;

import java.util.List;

public class PharmacyApp {
    /**
     * Initializes the pharmacy with medications, patients, and prescriptions.
     * @param pharmacy the Pharmacy instance to populate
     */
    public static void initializePharmacy(Pharmacy pharmacy) {
        // Create Medications
        Medication med1 = new Medication(1L, "Aspirin", "500mg", 1000, MedType.ACE_INHIBITOR);
        Medication med2 = new Medication(2L, "Amoxicillin", "250mg", 50, MedType.ACE_INHIBITOR);
        Medication med3 = new Medication(3L, "Ibuprofen", "200mg", 2000, MedType.ACE_INHIBITOR);
        Medication med4 = new Medication(4L, "Lisinopril", "10mg", 750, MedType.ACE_INHIBITOR);
        Medication med5 = new Medication(5L, "Metformin", "500mg", 600, MedType.ACE_INHIBITOR);
        Medication med6 = new Medication(6L, "Cetirizine", "10mg", 1500, MedType.ACE_INHIBITOR);
        Medication med7 = new Medication(7L, "Azithromycin", "500mg", 400, MedType.ACE_INHIBITOR);
        Medication med8 = new Medication(8L, "Omeprazole", "20mg", 800, MedType.ACE_INHIBITOR);
        Medication med9 = new Medication(9L, "Paracetamol", "500mg", 1200, MedType.ACE_INHIBITOR);
        Medication med10 = new Medication(10L, "Simvastatin", "20mg", 900, MedType.SSRI);
        Medication med11 = new Medication(11L, "Atorvastatin", "10mg", 1100, MedType.SSRI);
        Medication med12 = new Medication(11L, "Atorvastatin", "20mg", 1100, MedType.SSRI);
        pharmacy.addMedication(med1);
        pharmacy.addMedication(med2);
        pharmacy.addMedication(med3);
        pharmacy.addMedication(med4);
        pharmacy.addMedication(med5);
        pharmacy.addMedication(med6);
        pharmacy.addMedication(med7);
        pharmacy.addMedication(med8);
        pharmacy.addMedication(med9);
        pharmacy.addMedication(med10);
        pharmacy.addMedication(med11);
        pharmacy.addMedication(med12);

        // Create Patients
        Patient patient1 = new Patient(1L, "No known allergies. Previous surgery in 2015.", "John Doe");
        Patient patient2 = new Patient(2L, "Allergic to penicillin. Asthma patient.", "Jane Smith");
        Patient patient3 = new Patient(3L, "Diabetic. High blood pressure.", "Alice Johnson");
        Patient patient4 = new Patient(4L, "No significant medical history.", "Bob Brown");
        Patient patient5 = new Patient(5L, "History of migraines. Seasonal allergies.", "Charlie Davis");
        pharmacy.addPatient(patient1);
        pharmacy.addPatient(patient2);
        pharmacy.addPatient(patient3);
        pharmacy.addPatient(patient4);
        pharmacy.addPatient(patient5);

        // Create Prescriptions
        Prescription prescription1 = new Prescription(1L, patient1, med11, "Take one tablet every 6 hours as needed for pain.", "Dr. Emily White", 5);
        Prescription prescription2 = new Prescription(2L, patient1, med12, "Take one capsule three times a day for 7 days.", "Dr. Michael Green",30);
        Prescription prescription3 = new Prescription(3L, patient3, med5, "Take one tablet twice daily with meals.", "Dr. Sarah Black", 60);
        Prescription prescription4 = new Prescription(4L, patient1, med1, "Take one tablet every 8 hours as needed for inflammation.", "Dr. David Blue",90);
        Prescription prescription5 = new Prescription(5L, patient2, med2, "Take one tablet every 8 hours as needed for inflammation.", "Dr. David Blue",90);
        pharmacy.addPrescription(prescription1);
        pharmacy.addPrescription(prescription2);
        pharmacy.addPrescription(prescription3);
        pharmacy.addPrescription(prescription4);
//        pharmacy.addPrescription(prescription5);
        // Process prescriptions
        prescription1.processPrescription();
        prescription2.processPrescription();
        prescription3.processPrescription();
        prescription4.processPrescription();
//        prescription5.processPrescription();
    }

    /**
     * Main entry point for the Pharmacy Management System application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pharmacy Management System Starting...");
        Pharmacy pharmacy = new Pharmacy();
        initializePharmacy(pharmacy);
        // Example output: print all medications for patient1
        Patient patient1 = pharmacy.getPatients().getFirst();
        patient1.printMedications();
        System.out.println("Welcome to the Pharmacy Management System!");
    }
}
