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
public class MiniMadLibs {
    public static void main(String[] args) {
        String noun1, adjective1, noun2, number, adjective2, pluralNoun1, pluralNoun2, pluralNoun3, verbPresent, verbPast;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!\n");
        
        System.out.println("I need a noun: ");
        noun1 = inputReader.nextLine();
        System.out.println("Now an adjective: ");
        adjective1 = inputReader.nextLine();
        System.out.println("Another noun: ");
        noun2 = inputReader.nextLine();
        System.out.println("Add a number: ");
        number = inputReader.nextLine();
        System.out.println("Another adjective: ");
        adjective2 = inputReader.nextLine();
        System.out.println("A plural noun: ");
        pluralNoun1 = inputReader.nextLine();
        System.out.println("Another one: ");
        pluralNoun2 = inputReader.nextLine();
        System.out.println("One more: ");
        pluralNoun3 = inputReader.nextLine();
        System.out.println("A verb (infinitive form): ");
        verbPresent = inputReader.nextLine();
        System.out.println("Same verb (past participle): ");
        verbPast = inputReader.nextLine();
        
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1 + ": the " + adjective1 + " frontier. These are"
            + " the voyages of the starship " + noun2 + ". It's " + number 
            + "-year mission: to explore strange " + adjective2 + " " + pluralNoun1 
            + ", to seek out the " + adjective2 + " " + pluralNoun2 + " and " 
            + adjective2 + " " + pluralNoun3 + ", to boldly " + verbPresent 
            + " where no one has " + verbPast + " before.");
    }
}
