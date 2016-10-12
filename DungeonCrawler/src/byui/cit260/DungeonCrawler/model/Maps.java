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
public class Maps implements Serializable {
    
    private Double rowCount;
    private Double columnCount;

    public Double getRowCount() {
        return rowCount;
    }

    public void setRowCount(Double rowCount) {
        this.rowCount = rowCount;
    }

    public Double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Double columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.rowCount);
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
        final Maps other = (Maps) obj;
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Maps{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    public Maps(Double rowCount, Double columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }
    
    
}
