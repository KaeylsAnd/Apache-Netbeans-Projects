/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity3rateperday;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Activity3RatePerDay {

    public static void main(String[] args) {
        
// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make the scannner work
        
// Variable Declaration
        double ratePerDay, numofDaysWorked, salary, tax, salaryWithTax;
        
// Input of the User
        System.out.print("Enter Rate Per Day: ");
        ratePerDay = n.nextDouble();
        System.out.print("Enter Number of Days Worked: ");
        numofDaysWorked = n.nextDouble();
   
// Computations
        salary = ratePerDay * numofDaysWorked; // Formula to get the salary of the user
        tax = salary * 0.15; // Formula to get the tax if salary is above 10,000
        salaryWithTax = salary - tax; // Formula to get the salary with the tax already subtracted from the salary
        
// Conditional Statements and Output of the Code
        if (salary >= 10000){
            System.out.println("The total tax is " + tax);
            System.out.println("The salary is " + salaryWithTax);
            
        } else {
            System.out.println("The salary is " + salary);
            
// End of Code
        }
        
    }
}
