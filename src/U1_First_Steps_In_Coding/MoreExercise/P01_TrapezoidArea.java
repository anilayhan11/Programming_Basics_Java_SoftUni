package U1_First_Steps_In_Coding.MoreExercise;

import java.util.Scanner;

// Напишете програма, която чете от конзолата три дробни числа b1, b2 и h
// и пресмята лицето на трапец с основи b1 и b2 и височина h.
// Формулата за лице на трапец е (b1 + b2) * h / 2.
public class P01_TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = (b1 + b2) * h / 2;

        System.out.printf("%.2f", area);
    }
}
