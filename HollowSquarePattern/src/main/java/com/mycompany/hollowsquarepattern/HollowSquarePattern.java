/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hollowsquarepattern;

/**
 *
 * @author sonia
 */
public class HollowSquarePattern {

    public static void main(String[] args) {
        		int n = 6; // ROWS
		
		for (int r = 1; r <= n; r++) { // ROWS

			for (int c = 1; c <= n - 1; c++) { // COLUMNS
				
				if (r == 1 || r == 6 || c == 1 || c == 5) {
					System.out.print("* " + " ");
					
				}else {
					System.out.print("   ");
					
				}
			}
			
			System.out.println();
			
		}
    }
}
