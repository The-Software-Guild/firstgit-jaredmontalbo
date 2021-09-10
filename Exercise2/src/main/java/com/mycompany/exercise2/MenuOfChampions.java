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
public class MenuOfChampions {
    
    public static void main(String[] args) {
        String item1, item2, item3;
        float itemPrice1, itemPrice2, itemPrice3;
        
        item1 = "Hamburger";
        item2 = "Fries";
        item3 = "Chicken Nuggets";
        itemPrice1 = 5.50F;
        itemPrice2 = 2.99F;
        itemPrice3 = 4F;
        
        String asciiArt = ".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.";
        
        System.out.println(asciiArt + "\n");
        System.out.println("WELCOME TO BURGER QUEEN!");
        System.out.println("Today's Menu Is...");
        System.out.println("\n" + asciiArt + "\n");
        System.out.printf("$%.2f *** %s\n", itemPrice1, item1);
        System.out.printf("$%.2f *** %s\n", itemPrice2, item2);
        System.out.printf("$%.2f *** %s\n", itemPrice3, item3);
    }
}
