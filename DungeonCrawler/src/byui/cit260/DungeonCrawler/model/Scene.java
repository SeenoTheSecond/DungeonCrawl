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
public class Scene implements Serializable {
    
    private String description;
    private Double blockedLocation;
    private String displaySymbol;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(Double blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + Objects.hashCode(this.blockedLocation);
        hash = 41 * hash + Objects.hashCode(this.displaySymbol);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + '}';
    }

    public Scene(String description, Double blockedLocation, String displaySymbol) {
        this.description = description;
        this.blockedLocation = blockedLocation;
        this.displaySymbol = displaySymbol;
    }
    
    
    
}
