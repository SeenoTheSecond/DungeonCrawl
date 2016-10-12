/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonCrawler.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jeff
 */
public class Items implements Serializable {
    
    private String inventoryType;
    private Double quantityInStock;
    private Double requiredAmount;

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(Double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.inventoryType);
        hash = 43 * hash + Objects.hashCode(this.quantityInStock);
        hash = 43 * hash + Objects.hashCode(this.requiredAmount);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Items other = (Items) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.quantityInStock, other.quantityInStock)) {
            return false;
        }
        if (!Objects.equals(this.requiredAmount, other.requiredAmount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }

    public Items(String inventoryType, Double quantityInStock) {
        this.inventoryType = inventoryType;
        this.quantityInStock = quantityInStock;
    }
    
    
}
