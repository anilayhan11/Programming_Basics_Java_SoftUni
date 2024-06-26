package U6_NestedLoop.MoreExercise;

import java.util.Scanner;

public class P11_HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double feeTotal = 0.00;

        for (int i = 1; i <= days; i++) {
            double feeCurrent = 0.00;
            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    feeCurrent += 2.50;
                    feeTotal += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    feeCurrent += 1.25;
                    feeTotal += 1.25;
                } else {
                    feeCurrent += 1.00;
                    feeTotal += 1.00;
                }
            }
            System.out.printf("Day: %d - %.2f leva\n", i, feeCurrent);
        }
        System.out.printf("Total: %.2f leva", feeTotal);
    }
}
