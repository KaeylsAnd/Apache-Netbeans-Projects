/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whileloops;

/**
 *
 * @author sonia
 */
import java.util.Scanner;
public class WhileLoops {
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
    int y, x = 1;

    System.out.print("Enter a number: ");
    y = n.nextInt();
    
        while (x <= y){
            if (x % 2 == 0){
                System.out.println(x);
        }
        x++;
    }
     
        x = 1;
        while (x <= y){
            if (x % 2 != 0){
                System.out.println(x);
        }
         x++;   
    }
       

    }
}

