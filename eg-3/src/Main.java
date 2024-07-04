import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double sideA;
        double sideB;
        double hypotenus;

        // Create scanner
        Scanner getInput = new Scanner(System.in);

        // Get sides A and B
        System.out.println("Enter length of side A: ");
        sideA = getInput.nextDouble();
        System.out.println("Enter length of side B: ");
        sideB = getInput.nextDouble();

        // Perform hypotenus calculation
        hypotenus = Math.sqrt((sideA * sideA) + (sideB * sideB));
        
        // Display results
        JOptionPane.showMessageDialog(null, "The hypotenus of a triangle with sides " + sideA + " and " + sideB + " is " + Math.round(hypotenus) + " rounded to the nearest whole number.");

        // Close the scanner class
        getInput.close();
    }
}