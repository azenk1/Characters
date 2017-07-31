/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenk.character;

/**
 *
 * @author Owner
 */

public class Hero extends Character {
    
    private String heroClass;
    
    public Hero(String name)
    {
        super(name);
    }
    
    public Hero(String name, String heroClass, String type, int attack,
            int defense, int accuracy)
    {
        super(name, type, attack, defense, accuracy);
        this.heroClass = heroClass;
        
    }
    

    
    public String getHeroClass(){return heroClass;}
    
 
    public String heroToString()
    {
        String heroStats = "\n*** YOUR HERO ***" + "\n Name: " + getName()
                + "\nClass: " + getHeroClass() +"\nAttack: " + getAttack()
                +"\nDefense: " + getDefense();
        return heroStats;
    }
   }
