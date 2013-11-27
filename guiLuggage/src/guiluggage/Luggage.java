/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiluggage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author workplz
 */
@Entity
@Table(name = "luggage", catalog = "seanmoy58_hva", schema = "")
@NamedQueries({
    @NamedQuery(name = "Luggage.findAll", query = "SELECT l FROM Luggage l"),
    @NamedQuery(name = "Luggage.findByLabelNumber", query = "SELECT l FROM Luggage l WHERE l.labelNumber = :labelNumber"),
    @NamedQuery(name = "Luggage.findByColor", query = "SELECT l FROM Luggage l WHERE l.color = :color"),
    @NamedQuery(name = "Luggage.findByShape", query = "SELECT l FROM Luggage l WHERE l.shape = :shape"),
    @NamedQuery(name = "Luggage.findByStorageLocation", query = "SELECT l FROM Luggage l WHERE l.storageLocation = :storageLocation"),
    @NamedQuery(name = "Luggage.findByAdditionalDetails", query = "SELECT l FROM Luggage l WHERE l.additionalDetails = :additionalDetails"),
    @NamedQuery(name = "Luggage.findByStatus", query = "SELECT l FROM Luggage l WHERE l.status = :status"),
    @NamedQuery(name = "Luggage.findByHandlerId", query = "SELECT l FROM Luggage l WHERE l.handlerId = :handlerId")})
public class Luggage implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "labelNumber")
    private String labelNumber;
    @Column(name = "color")
    private String color;
    @Column(name = "shape")
    private String shape;
    @Basic(optional = false)
    @Column(name = "storageLocation")
    private String storageLocation;
    @Column(name = "additionalDetails")
    private String additionalDetails;
    @Basic(optional = false)
    @Column(name = "status")
    private boolean status;
    @Column(name = "handlerId")
    private String handlerId;

    public Luggage() {
    }

    public Luggage(String labelNumber) {
        this.labelNumber = labelNumber;
    }

    public Luggage(String labelNumber, String storageLocation, boolean status) {
        this.labelNumber = labelNumber;
        this.storageLocation = storageLocation;
        this.status = status;
    }

    public String getLabelNumber() {
        return labelNumber;
    }

    public void setLabelNumber(String labelNumber) {
        String oldLabelNumber = this.labelNumber;
        this.labelNumber = labelNumber;
        changeSupport.firePropertyChange("labelNumber", oldLabelNumber, labelNumber);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String oldColor = this.color;
        this.color = color;
        changeSupport.firePropertyChange("color", oldColor, color);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        String oldShape = this.shape;
        this.shape = shape;
        changeSupport.firePropertyChange("shape", oldShape, shape);
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        String oldStorageLocation = this.storageLocation;
        this.storageLocation = storageLocation;
        changeSupport.firePropertyChange("storageLocation", oldStorageLocation, storageLocation);
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        String oldAdditionalDetails = this.additionalDetails;
        this.additionalDetails = additionalDetails;
        changeSupport.firePropertyChange("additionalDetails", oldAdditionalDetails, additionalDetails);
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        boolean oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(String handlerId) {
        String oldHandlerId = this.handlerId;
        this.handlerId = handlerId;
        changeSupport.firePropertyChange("handlerId", oldHandlerId, handlerId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (labelNumber != null ? labelNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Luggage)) {
            return false;
        }
        Luggage other = (Luggage) object;
        if ((this.labelNumber == null && other.labelNumber != null) || (this.labelNumber != null && !this.labelNumber.equals(other.labelNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "guiluggage.Luggage[ labelNumber=" + labelNumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
