package U2_ConditionalStatements.L2_Exercise;

import java.util.Scanner;

public class P03_TimePlus10Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int minTotal = hour * 60 + min + 15;

        int newHour = minTotal / 60;
        int newMin = minTotal % 60;

        if (newHour > 23) {
            newHour = 0;
        }

        if (newMin < 10) {
            System.out.printf("%d:0%d", newHour, newMin);

        } else {
            System.out.printf("%d:%d", newHour, newMin);

        }
    }
}