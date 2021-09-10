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
public class BiggerBetterAdder {
    public static void main(String[] args) {
        int num1, num2, num3, result;
        
        Scanner inputReader = new Scanner(System.in);
       
        System.out.println("Enter the first number: ");
        num1 = inputReader.nextInt();
        System.out.println("Enter the second number: ");
        num2 = inputReader.nextInt();
        System.out.println("Enter the third number: ");
        num3 = inputReader.nextInt();
        
        
        result = num1 + num2+ num3;
        
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result);
    }
}
