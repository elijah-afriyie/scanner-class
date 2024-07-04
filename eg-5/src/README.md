````markdown
# Java Grid Generator Example

This project demonstrates a Java program that uses nested loops and the `Scanner` class to create a grid of a specified number of rows and columns using a user-provided symbol.

## Getting Started

Create a file named `Main.java` and paste the following code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = input.nextInt();
        System.out.println("Enter # of columns: ");
        columns = input.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = input.next();

        for (int i = 1; i < rows; i++) {
            System.out.println();
            for (int j = 1; j < columns; j++) {
                System.out.print(symbol);
            }
        }

        input.close();
    }
}
```
````

Open a terminal and navigate to the directory containing `Main.java`. Compile the program using the following command:

```sh
javac Main.java
```

Run the program with the following command:

```sh
java Main
```

## Notes

- The `Scanner` class is used to get user input for the number of rows, number of columns, and the symbol to use in the grid.
- Nested `for` loops are used to print the grid.
- The outer loop iterates over the rows, and the inner loop iterates over the columns.
- The `Scanner` object is properly closed at the end of the program to avoid resource leaks.

```

```
