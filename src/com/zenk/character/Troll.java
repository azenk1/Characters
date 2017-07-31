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



public class Troll extends Character{
       
  
    public Troll()
    {
        super("Troll", "Monster", 2, 15, 1, 3);
       
    }
    
    @Override
    public String toString()
    {
        String trollString = "Name: " + getName() + "\nType: " + getType()
                + "\nAttack: " + getAttack() + "\nDefense: " + getDefense();
        
        return trollString;
    }
}
