package U2_ConditionalStatements.L2_Exercise;

import java.util.Scanner;

public class P02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double bonus = 0.00;

        if (num <= 100) {
            bonus += 5;
        } else if (num <= 1000) {
            bonus += num * 0.20;
        } else {
            bonus += num * 0.10;
        }

        if (num % 2 == 0) {
            bonus += 1;
        }
        if (num % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(num + bonus);
    }
}
