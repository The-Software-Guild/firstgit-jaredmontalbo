/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercise3;

import java.util.Scanner;

/**
 *
 * @author Jared
 */
public class DoItBetter {
    
    public static void main (String[] args) {
        int numMiles, numHotDogs, numLanguages;
        
        Scanner inputReader = new Scanner(System.in);
    
        System.out.println("How many miles can you run?");
        numMiles = inputReader.nextInt();
        System.out.println("How many hot dogs can you eat?");
        numHotDogs = inputReader.nextInt();
        System.out.println("How many languages do you know?");
        numLanguages = inputReader.nextInt();
        
        System.out.println("That's it? I can run " + (numMiles * 2 + 1) + " miles, \n"
                + "eat " + (numHotDogs * 2 + 1) +  " hot dogs, \n"
                + "and know " + (numLanguages * 2 + 1) + " languages. Come on man...");
    }
}
