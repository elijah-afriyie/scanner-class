import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	// Initialize variable to hold data
        String holdData = "Elijah Afriyie 28";
        
        // Create scanner
        Scanner scanner = new Scanner(holdData);

	// Get data from memory
        String firstName = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();

	// Print results
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);

        scanner.close();
    }
}
