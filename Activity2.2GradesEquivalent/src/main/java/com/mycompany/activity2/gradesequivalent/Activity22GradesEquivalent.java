/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity2.gradesequivalent;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Activity22GradesEquivalent {

    public static void main(String[] args) {
        
// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make the scannner work
        
// Varaible Declaration
        int midTerm, finalGrade, average;
        
// Input of the User
        System.out.print("Enter mid term grade: ");
        midTerm = n.nextInt();
        
        System.out.print("Enter final grade: ");
        finalGrade = n.nextInt();
        
// Computation or Formula to get average
        average = (midTerm + finalGrade) / 2;
        
// Result
        System.out.println("Average grade is: " + average);
        
// Conditional Statements
        if (average >= 96 && average <= 100){
            System.out.println("The equivalent is 4.0");
            
        }else if (average >= 90 && average <= 95){
            System.out.println("The equivalent is 3.5");
            
        }else if (average >= 84 && average <= 89){
            System.out.println("The equivalent is 3.0");
            
        }else if (average >= 78 && average <= 83){
            System.out.println("The equivalent is 2.5");
            
        }else if (average >= 72 && average <= 77){
            System.out.println("The equivalent is 2.0");
            
        }else if (average >= 66 && average <= 71){
            System.out.println("The equivalent is 1.5");
            
        }else if (average >= 60 && average <= 60){
            System.out.println("The equivalent is 1.0");
            
        }else if (average >= 0 && average <= 59){
            System.out.println("The equivalent grade is R");
            
        }else{
            System.out.println("Invalid Input");
           
// End of Code
        }
    }
}
