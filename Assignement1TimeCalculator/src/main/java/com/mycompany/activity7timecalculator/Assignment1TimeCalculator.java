/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity7timecalculator;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Assignment1TimeCalculator {
    
    public static void main(String[] args) {
        
// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make the scannner work
        
// Variable Declarations
        int hr, min, sec, totalSec;
        
// Input of the User
        System.out.print("Enter the hours of elapsed time: ");
        hr = n.nextInt();
        
        System.out.print("Enter the minutes of elapsed time: ");
        min = n.nextInt();
        
        System.out.print("Enter the seconds of elapsed time: ");
        sec = n.nextInt();
        
// Computations or Formula
        totalSec = (hr * 3600 * min * 60 + sec); // Formula to get the total seconds
        
// Conditional Statements
        if (hr >= 1 && hr <= 24 && min >= 1 && min <= 60 && sec >= 1 && sec <= 60){ // Limited to 24/60/60
            System.out.println("The elapsed time you entered is: " + hr + ":" + min + ":" + sec); // Output
            System.out.println("The elapsed time in seconds is: " + totalSec); // Output
            
        } else {
            System.out.println("Invalid Formatted Time!"); // Output
            
// End of Code
        }

    }
}
