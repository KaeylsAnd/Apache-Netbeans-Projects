/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity5.busfare;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Activity52BusFare {

    public static void main(String[] args) {
        
// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make scanner work
        
// Variable Declarations
        double distance, totalFare, discountedFare, amountTendered, change, regularFare, amountNeeded, lessFare;
        int discountType;
        
// Input of the User
        System.out.print("Enter distance: ");
        distance = n.nextDouble();
        
        System.out.print("Enter amount tendered: ");
        amountTendered = n.nextDouble();
        
        System.out.println("1. Student");
        System.out.println("2. Senior");
        System.out.println("3. PWD");
        System.out.println("4. Regular");
        
        System.out.print("Enter discount type: ");
        discountType = n.nextInt();
       
// Given || Fixed Value
        regularFare = 30.0;
        discountedFare = 0.0;
        
// Conditional Statements
        if (distance > 4){
            regularFare += (distance - 4) * 5; // regularFare += (distance - 4) * 5;:
// If the distance is greater than 4, this line of code calculates an additional fare based on the excess distance. Here's how it works:
// (distance - 4) calculates the excess distance beyond the initial 4 units. For example, if the distance is 6, (6 - 4) equals 2, meaning there are 2 extra units beyond the initial 4.
// (distance - 4) * 5 calculates the fare for the excess distance. In this case, it multiplies the excess distance (2) by 5, indicating that each additional unit beyond the initial 4 costs $5.
// regularFare += ... adds this additional fare to the regularFare variable. It's using the += operator to increment regularFare by the calculated fare.
            
        }
    
// Switch Function
        switch(discountType){
            // Case 1
            case 1:
                discountedFare = regularFare * 0.20; // Formula to get the Discount
                break; // Used to end the first case
                
            // Case 2
            case 2:
                discountedFare = regularFare * 0.20; // Formula to get the Discount
                break; // Used to end the second case
                
            // Case 3
            case 3:
                discountedFare = regularFare * 0.20; // Formula to get the Discount
                break; // Used to end the third case
                
            // Case 4
            case 4:
                if (discountType >= 5); // if the discount type entered is not in the choices, print "Invalid Discount Type"
                System.out.println("Invalid Discount Type.");
                break; // Used to end the fourth case
                
        }
        
// Computation || Formula 
        lessFare = regularFare - discountedFare; // Formula to get the Less Fare
        
        System.out.println("Your total fare is " + regularFare);
        
// Conditional Statements 
        if (amountTendered < lessFare){
            amountNeeded = lessFare - amountTendered; // Formula to get the amount needed to meet the required fare.
            System.out.println("You need to add " + amountNeeded + " to meeet the required fare.");
            
        }else{
            change = amountTendered - lessFare; // Formula to get the change
            System.out.println("Your amount tendered is " + amountTendered);
            System.out.println("Your discounted fare is " + lessFare);
            System.out.println("Your change is " + change);
            
// End of Code
        }
    }
}
