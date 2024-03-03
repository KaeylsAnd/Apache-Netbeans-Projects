/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diamondpattern;

/**
 *
 * @author sonia
 */
public class DiamondPattern {

    public static void main(String[] args) {
        		
		int n = 4; // ROWS
		
		for (int r = 1; r <= n; r++) { // ROWS
			
			for (int c = 1; c <= n - r; c++) { // COLUMNS
				
				System.out.print(" ");
				
			}
			
			for (int c = 1; c <= r ; c++) {
				
				System.out.print("* ");
				
			}

			System.out.println();
			
		}
		
		for (int r = 0; r < n; r++) {
			
			for (int c = 0; c <= r; c++) {
				System.out.print(" ");
				
			}
			
			for (int c = 1; c < n - r; c++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
