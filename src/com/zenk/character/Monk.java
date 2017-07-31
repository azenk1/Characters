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
public class Monk extends Hero{
   
    
    /*Make members static so that they are not instance variables. If they are
    Instance variables they will not exist when the call to the super class
    Constructor is made below.*/
    
    private static  final int ATTACK = 10;
    private static final String TYPE = "Human";
    private static final int DEFENSE = 12;
    private static final int ACCURACY = 8;
    private static final String SPECIAL_ATTACK = "Meditate";
    private static final String CLASS = "Monk";

    /**
     * Constructor for Monk. Takes name in as parameter to allow user input.
     * @param name 
     */
    public Monk(String name)
    {
        super(name, CLASS, TYPE, ATTACK, DEFENSE, ACCURACY);
        
    }
 
    public String getSpecialAttack(){return SPECIAL_ATTACK;}
    
    
    
    @Override
    public String toString()
    {
        
       String monkStats = heroToString() + "\nSpecial Skill: " + SPECIAL_ATTACK
               + "\n";
                
        return monkStats;
    }
 
    
}
