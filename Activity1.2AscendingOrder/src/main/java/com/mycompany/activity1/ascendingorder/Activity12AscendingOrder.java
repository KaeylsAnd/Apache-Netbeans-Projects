/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity1.ascendingorder;

/**
 *
 * @author sonia
 */
// Start of Code
import java.util.Scanner; // Scanner package
public class Activity12AscendingOrder {

    public static void main(String[] args) {
    
// Scanner Declaration
        Scanner n = new Scanner(System.in); // Used to make the scannner work
        
// Variable Declaration
        double a, b, c;
        
// Input of the User
        System.out.print("Enter first number: ");
        a = n.nextDouble();
        
        System.out.print("Enter second number: ");
        b = n.nextDouble();
        
        System.out.print("Enter third number: ");
        c = n.nextDouble(); 
        
// Conditional Statements

        // A, B, C || A, C, B == if, if, else
        // B, A, C || B, C, A == else if, if, else
        // C, A, B || C, B, A == else if, if, else
        
        if (a <= b && a <= c){
            System.out.println(a);
            
            if (b <= c){
                System.out.println(b + "\n" + c);
                
            }else{
                System.out.println(c + "\n" + b);
            }
            
        // Formula to get B, A, C || B, C, A
        } else if (b <= a && b <= c){
            System.out.println(b);
            
            if (a <= c){
                System.out.println(a + "\n" + c);
                
            }else{
                System.out.println(c + "\n" + a);
            }
            
        // Formula to get C, A, B || C, B, A
        }else if (c <= a && c <= b){
            System.out.println(c);
            
            if (a <= b){
                System.out.println(a + "\n" + b);
                
            } else{
                System.out.println(b + "\n" + a);
                
// End of Code
            }
        }
    }
}
