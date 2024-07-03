import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String data = "Elijah Afriyie 28";
        Scanner scanner = new Scanner(data);

        String firstName = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);

        scanner.close();
    }
}
