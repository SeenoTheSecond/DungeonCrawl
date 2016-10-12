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
public class Game implements Serializable {
    
    private Double totalTime;
    private String noPeople;

    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    public String getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(String noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.totalTime);
        hash = 43 * hash + Objects.hashCode(this.noPeople);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.noPeople, other.noPeople)) {
            return false;
        }
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
    }

    public Game(Double totalTime, String noPeople) {
        this.totalTime = totalTime;
        this.noPeople = noPeople;
    }
    
    
}
