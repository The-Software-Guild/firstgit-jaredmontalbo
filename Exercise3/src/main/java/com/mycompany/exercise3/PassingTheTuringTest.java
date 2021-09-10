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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        String name, color, food;
        int number, computerNum;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there!\n"
                + "What's your name?");
        
        name = inputReader.nextLine();
        
        System.out.println("\nHi, " + name + "! I'm Thomas.\n"
                + "What's your favorite color?");
        
        color = inputReader.nextLine();
        
        System.out.println("\nHuh, " + color + "? Mine's Orange.\n"
                + "I really like oranges. They're my favorite fruit, too.\n"
                + "What's your favorite fruit, " + name + "?");
        
        food = inputReader.nextLine();
        
        System.out.println("\nReally? " + food + "? That's wild!\n"
                + "Speaking of favorites, what's your favorite number?");
        
        number = inputReader.nextInt();
        computerNum = 23;
        System.out.println("\n" + number + " is a cool number. Mine's " + computerNum + ".\n"
                + "Did you know " + number + " * " + computerNum + " = " + number * computerNum + "?\n"
                + "That's a cool number too!\n"
                + "Well, thanks for talking to me, " + name + "!");
    }
    
}
