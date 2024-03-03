/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity4averagegrade;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Activity4AverageGrade {

    public static void main(String[] args) {

// Scanner Declaration
        Scanner n = new Scanner(System.in);  // Used to make the scannner work
    
// Variable Declarations
        double math, eng, sci, comp, pe, avg;
        String fn, ln, yns;
       
// Input of the User
        System.out.print("Enter Your First Name: ");
        fn = n.nextLine();
        
        System.out.print("Enter your Last Name: ");
        ln = n.nextLine();
        
        System.out.print("Enter your Year and Section: ");
        yns = n.nextLine();
        
        System.out.print("Enter your Grades in Math: ");
        math = n.nextDouble();
        
        System.out.print("Enter your Grades in English: ");
        eng = n.nextDouble();
        
        System.out.print("Enter your Grades in Science: ");
        sci = n.nextDouble();
        
        System.out.print("Enter your Grades in Computer: ");
        comp = n.nextDouble();
        
        System.out.print("Enter your Grades in P.E: ");
        pe = n.nextDouble();
        
// Computations
        avg = (math + eng + sci + comp + pe) / 5; // Formula to get the average grade
     
// Output of the Code
        System.out.println("Your Average Grade is " + avg);
        
// End of Code
    }
}
