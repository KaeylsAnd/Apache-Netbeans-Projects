/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity4.arithmethicoperations;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Activity42ArithmethicOperations {

    public static void main(String[] args) {
        
// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make the scannner work
        
// Variable Declaration
        int num1, num2, outcome;
        char op;
        
// Input of the User
        System.out.print("Enter first number: ");
        num1 = n.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = n.nextInt();
        
        // Choices of operations
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        
        System.out.print("Enter an Operator: ");
        // op = n.nextChar is not applicable. Use n.next().charAt(0); to input a character
        op = n.next().charAt(0); // varaible = scannerVariable.next().charAt(0);
        // The charAt(0) command is used in combination with the simple next() command which instructs Java to record the next character or string that is input into the command line. This input can be a string, character, or numeral. 
        
        // The charAt command is a way to filter the unwanted data types and only restricts the input to char data type. Since charAt only returns output in the form of a char value, it converts any type of data type to a char type.

        
// Switch Cases
        switch(op){
            
            // Case 1
            case '+':
                outcome = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + outcome);
                break; // Used to end first case
                
            // Case 2
            case '-':
                outcome = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + outcome);
                break; // Used to end second case
                
            // Case 3
            case '*':
                outcome = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + outcome);
                break; // Used to end third case
            
            // Case 4
            case '/':
                // Conditional Statement: if num2 is not equal to 0, divide.
                if (num2 != 0){
                outcome = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + outcome);
                
                // Conditional Statement: if num2 is equal to 0, print Division is not allowed.
                }else{
                    System.out.println("Division by zero is not allowed!");
                    
                break; // Used to end fourth case
                
                }
            // Default option if none of the cases above are picked.  
            default:
                System.out.println("Invalid operation!"); // If none of the choices are chosen, print Invalid Operation

// End of Code
        }
    }
}
