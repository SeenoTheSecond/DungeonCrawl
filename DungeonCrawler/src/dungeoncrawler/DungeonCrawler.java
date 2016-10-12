/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeoncrawler;

import byui.cit260.DungeonCrawler.model.Player;



/**
 *
 * @author Jeff
 */
public class DungeonCrawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestScore(7.00);

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
        }
    }
    

