import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.println("Enter # of rows: ");
        rows = input.nextInt();
        System.out.println("Enter # of columns: ");
        columns = input.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = input.next().charAt(0);

        for (int i = 1; i < rows; i++) {
            System.out.println();
            for (int j = 1; j < columns; j++) {
                System.out.print(symbol);
            }
        }

        input.close();
    }
}