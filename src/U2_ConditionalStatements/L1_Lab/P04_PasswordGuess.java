package U2_ConditionalStatements.L1_Lab;

import java.util.Scanner;

public class P04_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        // s3cr3t!P@ssw0rd

        if (inputText.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
