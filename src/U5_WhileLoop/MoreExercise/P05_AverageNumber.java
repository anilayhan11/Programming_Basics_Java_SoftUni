package U5_WhileLoop.MoreExercise;

import java.util.Scanner;

public class P05_AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        double sum = 0.00;

        for (int i = 1; i <= inputCount; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
        }
        double average = sum / inputCount;
        System.out.printf("%.2f",average);

    }
}
