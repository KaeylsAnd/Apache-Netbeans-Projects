/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity4volumeofregularsolid;

/**
 *
 * @author sonia
 */
import java.util.Scanner;
public class Activity4VolumeOfRegularSolid {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        double l, w, h, volume;
                
        System.out.print("Enter Length: ");
        l = n.nextDouble();
        
        System.out.print("Enter Height: ");
        h = n.nextDouble();
        
        System.out.print("Enter Width: ");
        w = n.nextDouble();
        
        volume = l * w * h;
        
        System.out.println("The volume is " + volume);
    }
}
