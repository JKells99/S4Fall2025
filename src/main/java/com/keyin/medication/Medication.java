/*
 * Medication.java
 * Represents a medication entity in the pharmacy system.
 * Author: Jordan Kelloway
 * Date: September 12, 2025
 */

package com.keyin.medication;

import com.keyin.Logger;

public class Medication {

    // `id`, `name`, `dosage`, `stock quantity`
    private long medId;
    private String medName;
    private String medDosage;
    private int medStockQuantity;
    private Enum<MedType> medType;

    /**
     * Constructs a Medication with all fields specified.
     * @param medId the medication ID
     * @param medName the name of the medication
     * @param medDosage the dosage of the medication
     * @param medStockQuantity the stock quantity
     * @param medType the type of medication
     */
    public Medication(long medId, String medName, String medDosage, int medStockQuantity, Enum<MedType> medType) {
        this.medId = medId;
        this.medName = medName;
        this.medDosage = medDosage;
        this.medStockQuantity = medStockQuantity;
        this.medType = medType;
    }

    /**
     * Constructs a Medication without an ID.
     * @param medName the name of the medication
     * @param medDosage the dosage of the medication
     * @param medStockQuantity the stock quantity
     * @param medType the type of medication
     */
    public Medication(String medName, String medDosage, int medStockQuantity, Enum<MedType> medType) {
        this.medName = medName;
        this.medDosage = medDosage;
        this.medStockQuantity = medStockQuantity;
        this.medType = medType;
    }

    /**
     * Default constructor for Medication.
     */
    public Medication() {
    }

    /**
     * Gets the type of medication.
     * @return the medication type
     */
    public Enum<MedType> getMedType() {
        return medType;
    }

    /**
     * Sets the type of medication.
     * @param medType the medication type
     */
    public void setMedType(Enum<MedType> medType) {
        this.medType = medType;
    }

    /**
     * Gets the medication ID.
     * @return the medication ID
     */
    public long getMedId() {
        return medId;
    }

    /**
     * Sets the medication ID.
     * @param medId the medication ID
     */
    public void setMedId(long medId) {
        this.medId = medId;
    }

    /**
     * Gets the name of the medication.
     * @return the medication name
     */
    public String getMedName() {
        return medName;
    }

    /**
     * Sets the name of the medication.
     * @param medName the medication name
     */
    public void setMedName(String medName) {
        this.medName = medName;
    }

    /**
     * Gets the dosage of the medication.
     * @return the medication dosage
     */
    public String getMedDosage() {
        return medDosage;
    }

    /**
     * Sets the dosage of the medication.
     * @param medDosage the medication dosage
     */
    public void setMedDosage(String medDosage) {
        this.medDosage = medDosage;
    }

    /**
     * Gets the stock quantity of the medication.
     * @return the stock quantity
     */
    public int getMedStockQuantity() {
        return medStockQuantity;
    }

    /**
     * Sets the stock quantity of the medication.
     * @param medStockQuantity the stock quantity
     */
    public void setMedStockQuantity(int medStockQuantity) {
        if (medStockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity cannot be negative");
        }
        if(medStockQuantity == 0) {
            Logger.logInventoryAlert("Stock for medication: " + medName + " has reached zero.");
        }
        this.medStockQuantity = medStockQuantity;
    }

    /**
     * Reduces the stock quantity by the specified amount if possible.
     * Logs an inventory alert if not enough stock is available.
     * @param quantity the quantity to reduce
     * @return true if stock was reduced, false otherwise
     */
    public boolean reduceStock(int quantity) {
        if (quantity > 0 && quantity <= medStockQuantity) {
            medStockQuantity -= quantity;
            return true;
        } else {
            System.out.println("Not enough stock for medication: " + medName);
            Logger.logInventoryAlert("Not Enough Stock For This medication: " + medName + ". Current Stock: " + medStockQuantity + ", Requested: " + quantity);
            return false;
        }
    }

    /**
     * Returns a string representation of the Medication object.
     * @return string representation
     */
    @Override
    public String toString() {
        return "Medication{" +
                "medId=" + medId +
                ", medName='" + medName + '\'' +
                ", medDosage='" + medDosage + '\'' +
                ", medStockQuantity=" + medStockQuantity +
                ", medType=" + medType +
                '}';
    }
}
