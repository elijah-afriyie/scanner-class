import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name in the following format: \"First Name\" \"Last Name\"");

        String firstname = scanner.next();
        String lastname = scanner.next();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("What is the name of your favorite pet?");
        String petName = scanner.next();

        JOptionPane.showMessageDialog(null, "Your first name is " + firstname + ", your last name is " + lastname + ", you are " + age + " years old, and your favorite pet is called " + petName + ".");
    }
}