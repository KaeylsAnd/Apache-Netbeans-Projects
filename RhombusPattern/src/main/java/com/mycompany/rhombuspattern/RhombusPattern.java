/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rhombuspattern;

/**
 *
 * @author sonia
 */
public class RhombusPattern {

    public static void main(String[] args) {
        int n = 5; // ROWS
		
		for (int r = 1; r <= n; r++) { // ROWS

			for (int c = 1; c <= r - 1; c++) { // COLUMNS
				System.out.print(" ");
				
			}
			
			for (int i = 1; i <= n - 1; i++) {
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
    }
}
