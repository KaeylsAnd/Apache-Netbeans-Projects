/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity6money;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Activity6Money {

    public static void main(String[] args) {
        
// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make the scannner work
        
// Variable Declarations
        int quarter, dime, nickel, penny, amount;
    
// Input of the User
        System.out.print("Enter an amount: ");
        amount = n.nextInt();
       
// Computations or Formula to get the remainder or the output
        quarter = amount / 25;
        amount = amount % 25;
        
        nickel = amount / 10;
        amount = amount % 10;
        
        dime = amount / 5;
        amount = amount % 5;
        
        penny = amount / 1;
        amount = amount % 1;
        
// Output of the Code
        System.out.println("Quarter: " + quarter);
        System.out.println("Nickel: " + nickel);
        System.out.println("Dime: " + dime);
        System.out.println("Penny: " + penny);
        
// End of Code
    }
}
