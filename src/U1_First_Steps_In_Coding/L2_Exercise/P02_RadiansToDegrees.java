package U1_First_Steps_In_Coding.L2_Exercise;

import java.util.Scanner;

public class P02_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // degrees = radians * 180 / Pi

        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);

    }
}
