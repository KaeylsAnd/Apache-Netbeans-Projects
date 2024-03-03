/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.butterflypattern;

/**
 *
 * @author sonia
 */
public class ButterflyPattern {

    public static void main(String[] args) {
        		
		int n = 4;
		
		for (int r = 1; r < n; r++) {
			
			for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
			
			for (int c = 1; c <= 2 * (5 - r); c++) {
                System.out.print(" ");
            }
			
			for (int c = 1; c <= r; c++) {
                System.out.print("*");
			
			}
			
			System.out.println();
        } // ================================================================================
		
		for (int r = 5; r >= 1; r--) {
			
			for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
			
			for (int c = 1; c <= 2 * (5 - r); c++) {
                System.out.print(" ");
            }
			
			for (int c = 1; c <= r; c++) {
                System.out.print("*");
			
			}
			System.out.println();
        }
    }
}
