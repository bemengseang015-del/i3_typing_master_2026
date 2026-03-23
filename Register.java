import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------ Register Screen -----------");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Registration successful!");
        System.out.println("Welcome, " + username + "!");

        scanner.close();
    }
}


