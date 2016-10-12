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
public class Location implements Serializable {
    
    private Double row;
    private Double column;
    private String visited;
    private String amountRemaining;

    public Double getRow() {
        return row;
    }

    public void setRow(Double row) {
        this.row = row;
    }

    public Double getColumn() {
        return column;
    }

    public void setColumn(Double column) {
        this.column = column;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(String amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.row);
        hash = 43 * hash + Objects.hashCode(this.column);
        hash = 43 * hash + Objects.hashCode(this.visited);
        hash = 43 * hash + Objects.hashCode(this.amountRemaining);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.amountRemaining, other.amountRemaining)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

    public Location(Double row, Double column, String visited, String amountRemaining) {
        this.row = row;
        this.column = column;
        this.visited = visited;
        this.amountRemaining = amountRemaining;
    }
    
    
}
