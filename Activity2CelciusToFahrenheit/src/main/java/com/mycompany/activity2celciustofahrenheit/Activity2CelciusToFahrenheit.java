/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity2celciustofahrenheit;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Activity2CelciusToFahrenheit {

    public static void main(String[] args) {

// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make the scannner work
        
// Variable Declaration
        double c, f;
        
// Input of the User
        System.out.print("Enter Celcius: ");
        c = n.nextDouble();
        
// Computations
        f = (c * 9/5) + 32; // Formula to convert celcius to fahrenheit
        
// Output of the code
        System.out.println("The converted celcius to faherenheit is: " + f);
        
// End of Code
        
    }
}
