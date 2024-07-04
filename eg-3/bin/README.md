````markdown
# Java Hypotenuse Calculation Example

This project demonstrates a Java program that uses the `Scanner` class to get user input for the sides of a triangle, calculates the hypotenuse using the `Math` class, and displays the result using `JOptionPane`.

## Getting Started

Create a file named `Main.java` and paste the following code:

```java
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double sideA;
        double sideB;
        double hypotenus;

        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter length of side A: ");
        sideA = getInput.nextDouble();

        System.out.println("Enter length of side B: ");
        sideB = getInput.nextDouble();

        hypotenus = Math.sqrt((sideA * sideA) + (sideB * sideB));
        JOptionPane.showMessageDialog(null, "The hypotenus of a triangle with sides " + sideA + " and " + sideB + " is " + Math.round(hypotenus) + " rounded to the nearest whole number.");

        getInput.close();
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

The `Scanner` class is used to get user input for the lengths of the triangle's sides. The `Math.sqrt` method calculates the hypotenuse, and `JOptionPane.showMessageDialog` displays the result in a message dialog.

```

```
