package com.keyin;

import com.keyin.medication.MedType;
import com.keyin.medication.Medication;
import com.keyin.patient.Patient;
import com.keyin.prescription.Prescription;

import java.util.List;

public class PharmacyApp {
    public static void main(String[] args) {
        // Create 10 Med objects
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

        // Create 5 Patients with different attributes
         Patient patient1 = new Patient(1L, "No known allergies. Previous surgery in 2015.", "John Doe");
         Patient patient2 = new Patient(2L, "Allergic to penicillin. Asthma patient.", "Jane Smith");
         Patient patient3 = new Patient(3L, "Diabetic. High blood pressure.", "Alice Johnson");
         Patient patient4 = new Patient(4L, "No significant medical history.", "Bob Brown");
         Patient patient5 = new Patient(5L, "History of migraines. Seasonal allergies.", "Charlie Davis");

        // Create 3 Prescriptions linking Patients and Medications
        Prescription prescription1 = new Prescription(1L, patient1, med11, "Take one tablet every 6 hours as needed for pain.", "Dr. Emily White", 5);
        Prescription prescription2 = new Prescription(2L, patient1, med12, "Take one capsule three times a day for 7 days.", "Dr. Michael Green",30);
        Prescription prescription3 = new Prescription(3L, patient3, med5, "Take one tablet twice daily with meals.", "Dr. Sarah Black", 60);

        // Create Prescriptions for patients 2 and 3 but add the same med to both
        Prescription prescription4 = new Prescription(4L, patient1, med1, "Take one tablet every 8 hours as needed for inflammation.", "Dr. David Blue",90);
        Prescription prescription5 = new Prescription(5L, patient2, med2, "Take one tablet every 8 hours as needed for inflammation.", "Dr. David Blue",90);

        System.out.println(patient1.getMedications());
        System.out.println("Welcome to the Pharmacy Management System!");




    }
}
