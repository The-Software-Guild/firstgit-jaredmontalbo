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
public class HealthyHearts {
    public static void main(String[] args) {
        int age, heartRate;
        int minHRZ, maxHRZ;
        
        Scanner inputReader = new Scanner(System.in);
       
        System.out.println("What is your age?");
        age = inputReader.nextInt();
        
        heartRate = 220 - age;
        minHRZ = (int) Math.ceil(heartRate / 2.00);
        maxHRZ = (int) Math.ceil(heartRate * 0.85);
        
        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute.\n");
        System.out.printf("Your target HR Zone is %d - %d beats per minute.", minHRZ, maxHRZ);
    }
}
