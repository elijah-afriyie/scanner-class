import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game. Press Q or q to quit.");

        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game. Peww Peww!");
        } else {
            System.out.println("You have quit the game!");
        }

        scanner.close();  // Correctly closing the scanner
    }
}
