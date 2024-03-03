/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity8finalprice;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Assignment2FinalPrice {

    public static void main(String[] args) {
        
// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make the scannner work
        
// Variable Declarations
        double finalPrice, originalPrice, markUpPercentage, sellingPrice, salesRate, amountMarkedUp, salesTax;
        
// Input of the User
        System.out.print("Enter the original price: ");
        originalPrice = n.nextDouble();
        
        System.out.print("Enter the marked up percentage: ");
        markUpPercentage = n.nextDouble();
        
        System.out.print("Enter the sales tax rate: ");
        salesRate = n.nextDouble();
        
// Computations or Formula for the program
        // Formula to get the selling price
        amountMarkedUp = (originalPrice * markUpPercentage) / 100;
        sellingPrice = originalPrice + amountMarkedUp;
        
        // Formula for sales tax
        salesTax = sellingPrice * (salesRate / 100);
        
        // Formula for sales rate
        salesRate = (salesTax / sellingPrice) * 100;
        
        // Formula for final price
        finalPrice = sellingPrice + salesTax;
                
        
        
// Output of the Code
        System.out.println("The original price: " + "$" + originalPrice);
        
        System.out.println("The price is marked up by: " + markUpPercentage + "%");
        
        System.out.println("The selling price is: " + "$" + sellingPrice);
        
        System.out.println("The sales rate: " + salesRate + "%");
        
        System.out.println("The sales tax: " + "$" + salesTax);
        
        System.out.println("The final price: " + "$" + finalPrice);
        
// End of Code
    }
}
