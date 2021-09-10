/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercise2;

/**
 *
 * @author Jared
 */
public class AllAboutMe {
    
    public static void main(String[] args) {
        String name, food, houseType;
        int numOfPets;
        boolean doesWhistle;
        
        name = "Jared";
        food = "pizza";
        numOfPets = 2;
        houseType = "house";
        doesWhistle = true;
        
        
        System.out.println("My name is " + name + "."
                + "\nMy favorite food is " + food + "."
                + "\nI have " + numOfPets + "pets."
                + "\nI live in a " + houseType + "."
                + "\nIt is " + doesWhistle + " I know how to whistle.");
    }
}
