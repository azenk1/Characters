/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenk.character;

/**
 *
 * @author Owner
 * Generic character class to provide base for specific characters
 */  
public class Character {
    
    private String name;
    private String type;
    private int attack;
    private int defense;
    private int accuracy;
    private int selectionNumber;
    
    public Character()
    {
    
    }
    
    
    public Character(String name)
    {
        this.name = name;
    }

    //Constructor for creatures
    public Character(String name, String type, int attack, int defense,
            int accuracy, int selectionNumber)
    {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.selectionNumber = selectionNumber;
        this.accuracy = accuracy;
    }
    
    //Constructor for heroes
    public Character(String name, String type, int attack, int defense,
            int accuracy)
    {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.accuracy = accuracy;
    }
    
    //Setter methods
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public void setAttack(int attack)
    {
        this.attack = attack;
    }
    
    public void setDefense(int defense)
    {
        this.defense = defense;
    }
    
    //Getter method
    public String getName(){return name;}
    
    public String getType(){return type;}
    
    public int getAttack(){return attack;}
    
    public int getDefense(){return defense;}
    
    
}
