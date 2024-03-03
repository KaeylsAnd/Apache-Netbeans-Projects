/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity3.sales;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Activity32Sales {

    public static void main(String[] args) {
     
// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make the scannner work
        
// Variable Declaration
        double sales, commission5, commission10, bonus, overall5, overall10, overall50;
        
// Input of the User
        System.out.print("Enter sales: ");
        sales = n.nextDouble();
        
// Computation or Formula

        // Computation to get the commission of 5%
        commission5 = (sales * 0.05);
        
        // Computation to get the commission of 10%
        commission10 = (sales * 0.10);
        
        // Computation to get the commission of 10% and 2000
        bonus = commission10 + 2000;

// Conditional Statements

        // Sales above 10000 but below 19999
        if (sales >= 10000 && sales <= 19999){
            System.out.println("Your commission is " + commission5);
            
        // Sales above 20000
        }else if (sales >= 20000){
            System.out.println("Your commission is " + commission10);
            
        }
            // Sales above 50000 will have 10% commission and 2000 bonus
            if (sales >= 50000){
                System.out.println("Your total bonus is " + bonus);
            
        }
                // Sales below 10000 won't have commissions
                if(sales < 10000){
                    System.out.println("You haven't reached the minimum sales.");
                    
// End of Code
        }
    }
}
