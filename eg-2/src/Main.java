import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    	// Create scanner
        Scanner scanner = new Scanner(System.in);

	// Request data and store data
        System.out.println("Enter your full name in the following format: \"First Name\" \"Last Name\"");

        String firstname = scanner.next();
        String lastname = scanner.next();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("What is the name of your favorite pet?");
        String petName = scanner.next();

	// Print results to dialogue box
        JOptionPane.showMessageDialog(null, "Your first name is " + firstname + ", your last name is " + lastname + ", you are " + age + " years old, and your favorite pet is called " + petName + ".");
    }
}
