/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity9joptionticket;

/**
 *
 * @author sonia
 */
// Start of Code
import javax.swing.*; // JOptionPane package
public class Activity7JOptionTicket {

    public static void main(String[] args) {
        
// Variable Declarations
        String movieName;
        double adultTicketPrice, childTicketPrice, numberofAdultTicketSold, numberofChildTicketSold, toBeDonated, numberofTicketSold, grossAmount, amountDonated, netSale;
        
// Input of the User
        // Input for string
        movieName = JOptionPane.showInputDialog("Enter movie name: ");
        
        // Input for Double, Int, Etc.
        adultTicketPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the adult ticket price: "));
        childTicketPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the child ticket price: "));
        numberofAdultTicketSold = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of adult ticket sold: "));
        numberofChildTicketSold = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of child ticket sold: "));
        toBeDonated = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to be donated: "));
        
// Computations of Formula & Solutions
        numberofTicketSold = numberofAdultTicketSold + numberofChildTicketSold;
        grossAmount = (adultTicketPrice * numberofAdultTicketSold) + (childTicketPrice * numberofChildTicketSold);
        amountDonated = grossAmount * toBeDonated / 100;
        netSale = grossAmount - amountDonated;
        
// Output of the Code
        JOptionPane.showMessageDialog(null, "Movie Name: " + movieName + "\n"
                + "Number of Tickets Sold: " + numberofTicketSold + "\n" +
                "Gross Amount: " + grossAmount + "\n" +
                "Percentage of the Gross Amount Donated: " + toBeDonated + "%" + "\n" +
                "Amount Donated: " + amountDonated + "\n" +
                "Net sales: " + netSale, "Theater Sales Data", JOptionPane.INFORMATION_MESSAGE);

// End of the Code        
    }
}
