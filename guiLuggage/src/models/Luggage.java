/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ChrisvanderHeijden
 */
public class Luggage {
    private String labelField;
    private String colorField;
    private String shapeField;
    private String storageLocation;
    private String additionalDetails;

    public Luggage(String labelField, String colorField, String shapeField, String storageLocation, String additionalDetails) {
        this.labelField = labelField;
        this.colorField = colorField;
        this.shapeField = shapeField;
        this.storageLocation = storageLocation;
        this.additionalDetails = additionalDetails;
    }

    public String getLabelField() {
        return labelField;
    }

    public void setLabelField(String labelField) {
        this.labelField = labelField;
    }

    public String getColorField() {
        return colorField;
    }

    public void setColorField(String colorField) {
        this.colorField = colorField;
    }

    public String getShapeField() {
        return shapeField;
    }

    public void setShapeField(String shapeField) {
        this.shapeField = shapeField;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }
    
    
}
