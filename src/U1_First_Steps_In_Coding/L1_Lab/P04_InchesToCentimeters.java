package U1_First_Steps_In_Coding.L1_Lab;

import java.util.Scanner;

public class P04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 inch = 2.54 cm
        int inches = Integer.parseInt(scanner.nextLine());
        double cm = inches * 2.54;

        System.out.println(cm);

    }
}
