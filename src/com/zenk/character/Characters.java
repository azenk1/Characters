/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenk.character;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Characters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
      
      //Invoke method to create hero.
      Hero newHero = userCreateHero();
      
      //Pass newHero to method that displays stats.
      displayHeroStats(newHero);
      
      //Prompt user for input by passing the result of promptForDirect()
      //as param. Return resulting enemy character from generateEnviron.
      //Store the returned enemy Character in "enemy" Character object.
      Character enemy = generateEnviron(promptForDirection());
      
      combat(newHero, enemy);
    }
    
    /**
     * Receives hero object as param and displays said hero object's stats.
     * @param displayHero 
     */
    public static void displayHeroStats(Hero displayHero)
    {
        System.out.println(displayHero.toString());
    }
    
    /**
     * Creates new Hero object by making call to heroSelection.
     * Returns created hero.
     * @return 
     */
    public static Hero userCreateHero()
    {
        //Variables to store choice of character and name.
        int characterChoice;
        String heroName;
        Hero newHero;
        
        //Scanner for user input.
        Scanner in = new Scanner(System.in);

        //Prompt user for name and store in heroName variable.
        System.out.println("Enter the name of your hero: ");
        heroName = in.nextLine();
        
        //Prompt user for class choice. Store in characterChoice variable.
        System.out.println("\n1. Monk\n 2. Warrior\n 3. Elf\n "
                + "Enter your Choice: ");
        characterChoice = in.nextInt();
        
        //newHero is assigned the values of the hero returned from heroSelection()
        newHero = heroSelection(heroName, characterChoice);
        
        //newHero returned to main method.
       return newHero;
    }
    
    /**
     * Uses heroName and characterChoice params to create hero with user
     * specified name and hero class.
     * @param heroName
     * @param characterChoice
     * @return 
     */
    public static Hero heroSelection(String heroName, int characterChoice)
    {
        
        //Switch determines how to procede with user specified characterChoice
        switch(characterChoice)
        {
            case 1: Monk monk = new Monk(heroName);
            return monk;
          
        }
     
        return null;
        
    }
    
    /**
     * Prompt the user for the direction.
     */
    public static int promptForDirection()
    {
        final String prompt = "Please Choose a direction:\n1. North\n2. South ";
        int directionChoice;
        Scanner in = new Scanner(System.in);
        
        System.out.println(prompt);
        directionChoice = in.nextInt();
        
        return directionChoice;
    }
    
    /**
     * Receives direction choice param as int. Determines which "direction" the
     * player has chosen to take in the dungeon. Depending on direction chosen
     * a specific enemy Character object will be generated.
     * @param directionChoice
     * @return - Returns the generated enemy character.
     */
    public static Character generateEnviron(int directionChoice)
    {
        //Diagnostic
        System.out.println(directionChoice);
        
        Character enemy = new Character();
        
        switch(directionChoice)
        {
            case 1:
                System.out.println("You have entered a rank cave littered with bones...");
                System.out.println("A troll has appeared!");
                
                //Create Troll object to be returned.
                enemy = new Troll();
                break;
                
            case 2:
                System.out.println("You have entered a sewer");
                System.out.println("A serpent has appeared!");
                
                //Create Serpent object to be returned.
                enemy = new Serpent();
               
                break;
        }
                
        return enemy;
    }
    
    public static void combat(Hero hero, Character enemy)
    {
        int heroHealth = hero.getDefense();
        int enemyHealth = enemy.getDefense();
        
        while(heroHealth > 0 && enemyHealth > 0)
        {
            enemyHealth -= hero.getAttack();
            System.out.println(enemyHealth);
            heroHealth -= enemy.getAttack();
            System.out.println(heroHealth);
        }
    }
 
    
}
