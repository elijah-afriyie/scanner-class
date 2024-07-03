```markdown
# Java Console Input and JOptionPane Example

## Prerequisites

- Java Development Kit (JDK) installed (preferably JDK 21 or higher).

## Getting Started

### 1. Create the Java Source File

Create a file named `Main.java` and paste the following code:

```java
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
```

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

### 4. Interact with the Program

- Enter your first name and last name when prompted.
- Enter your age when prompted.
- Enter the name of your favorite pet when prompted.
- A dialog box will appear displaying the provided information.

## How It Works

- The `Scanner` class is used to read user input from the console.
- `scanner.next()` reads the next token from the console input as a `String`.
- `scanner.nextInt()` reads the next token as an `int`.
- `JOptionPane.showMessageDialog` displays a message dialog with the provided information.
```