package com.keyin.medication;

import com.keyin.Logger;

public class Medication {

    // `id`, `name`, `dosage`, `stock quantity`
    private long medId;
    private String medName;
    private String medDosage;
    private int medStockQuantity;
    private Enum<MedType> medType;

    public Medication(long medId, String medName, String medDosage, int medStockQuantity, Enum<MedType> medType) {
        this.medId = medId;
        this.medName = medName;
        this.medDosage = medDosage;
        this.medStockQuantity = medStockQuantity;
        this.medType = medType;
    }

    public Medication(String medName, String medDosage, int medStockQuantity, Enum<MedType> medType) {
        this.medName = medName;
        this.medDosage = medDosage;
        this.medStockQuantity = medStockQuantity;
        this.medType = medType;
    }

    public Medication() {
    }

    public Enum<MedType> getMedType() {
        return medType;
    }

    public void setMedType(Enum<MedType> medType) {
        this.medType = medType;
    }

    public long getMedId() {
        return medId;
    }

    public void setMedId(long medId) {
        this.medId = medId;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getMedDosage() {
        return medDosage;
    }

    public void setMedDosage(String medDosage) {
        this.medDosage = medDosage;
    }

    public int getMedStockQuantity() {
        return medStockQuantity;
    }

    public void setMedStockQuantity(int medStockQuantity) {
        this.medStockQuantity = medStockQuantity;
    }

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

    @Override
    public String toString() {
        return STR."Medication{medDosage='\{medDosage}\{'\''}, medId=\{medId}, medName='\{medName}\{'\''}, medStockQuantity=\{medStockQuantity}, medType=\{medType}\{'}'}";
    }
}
