/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.average.sum;

/**
 *
 * @author sonia
 */
import java.util.Scanner;
public class AverageSum {

    public static void main(String[] args) {
        
        Scanner n = new Scanner (System.in);
        
        int num1, num2, sum, avg;
        
        System.out.print("Enter first number: ");
        num1 = n.nextInt();
        
        System.out.print("Enter first number: ");
        num2 = n.nextInt();
        
        sum = num1 + num2;
        
        avg = sum / 2;
        
        System.out.println("The sum is " + sum + " and the average is " + avg + ".");
        
    }
}
