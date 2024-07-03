````markdown
# Java Scanner Example

This project demonstrates a simple Java program using the `Scanner` class to parse a string containing multiple pieces of data (first name, last name, and age) and print each piece individually.

## Prerequisites

- Java Development Kit (JDK) installed (preferably JDK 21 or higher).

## Getting Started

Follow these steps to compile and run the Java program:

### 1. Create the Java Source File

Create a file named `Main.java` and paste the following code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Data string containing first name, last name, and age
        String data = "Elijah Afriyie 28";
        Scanner scanner = new Scanner(data);

        // Parsing the data string
        String firstName = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();

        // Printing the parsed data
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);

        // Closing the scanner
        scanner.close();
    }
}
```
````

### 2. Compile the Program

Open a terminal and navigate to the directory containing `Main.java`. Compile the program using the following command:

```sh
javac Main.java
```

### 3. Run the Program

After compiling, run the program with the following command:

```sh
java Main
```

### 4. Output

The program will output the following:

```
Elijah
Afriyie
28
```

## How It Works

- The `Scanner` class is used to parse a string containing multiple pieces of data.
- `scanner.next()` reads the next token from the data string and returns it as a `String`.
- `scanner.nextInt()` reads the next token as an `int`.
- The parsed data (first name, last name, and age) are printed to the console.

## Notes

- Ensure that your environment is correctly set up for running Java applications.
- The `scanner.close()` method is called to close the `Scanner` object and release any resources associated with it.
