/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity1areaofsquare;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Activity1AreaOfSquare {

    public static void main(String[] args) {
        
// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make the scannner work
        
// Variable Declaration
        int length, height, area;
      
// Input of User
        System.out.print("Enter height of square: ");
        height = n.nextInt();
        System.out.print("Enter length of square: ");
        length = n.nextInt();

// Computations
        area = length * height; // Formula to get the area of any quadrilateral 
        
// Output of the Code
        System.out.println("The area of sqaure is: " + area);
        
// End of the Code
        
    }
}