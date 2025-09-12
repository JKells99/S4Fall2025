package com.keyin.medication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedicationTest {
    @Test
    void testMedicationCreation() {
        Medication med = new Medication(1, "Aspirin", "500mg", 100, MedType.ACE_INHIBITOR);
        Assertions.assertEquals(1, med.getMedId());
        Assertions.assertEquals("Aspirin", med.getMedName());
        Assertions.assertEquals("500mg", med.getMedDosage());
        Assertions.assertEquals(100, med.getMedStockQuantity());
        Assertions.assertEquals(MedType.ACE_INHIBITOR, med.getMedType());
    }

    @Test
    void testMedicationSetters() {
        Medication med = new Medication();
        med.setMedId(2);
        med.setMedName("Ibuprofen");
        med.setMedDosage("200mg");
        med.setMedStockQuantity(50);
        med.setMedType(MedType.NSAID);

        Assertions.assertEquals(2, med.getMedId());
        Assertions.assertEquals("Ibuprofen", med.getMedName());
        Assertions.assertEquals("200mg", med.getMedDosage());
        Assertions.assertEquals(50, med.getMedStockQuantity());
        Assertions.assertEquals(MedType.NSAID, med.getMedType());
    }
    @Test
    void testMedicationStockQuantity() {
        Medication med = new Medication("Paracetamol", "500mg", 200, MedType.ANALGESIC);
        Assertions.assertEquals(200, med.getMedStockQuantity());

        med.setMedStockQuantity(150);
        Assertions.assertEquals(150, med.getMedStockQuantity());
    }

    @Test
    void testMedicationToString() {
        Medication med = new Medication(3, "Amoxicillin", "250mg", 75, MedType.ANTIBIOTIC);
        String expected = "Medication{medId=3, medName='Amoxicillin', medDosage='250mg', medStockQuantity=75, medType=ANTIBIOTIC}";
        Assertions.assertEquals(expected, med.toString());
    }

    @Test
    void testMedicationEquality() {
        Medication med1 = new Medication(4, "Lisinopril", "10mg", 60, MedType.ACE_INHIBITOR);
        Medication med2 = new Medication(4, "Lisinopril", "20mg", 60, MedType.ACE_INHIBITOR);

        Assertions.assertNotEquals(med1.getMedDosage(), med2.getMedDosage());

    }
    @Test
    void testStockQuantityCannotBeNegative() {
        Medication med = new Medication("TestMed", "100mg", 10, MedType.VITAMIN);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            med.setMedStockQuantity(-5);
        });
    }


}
